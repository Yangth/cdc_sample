package com.bottle.sample.common.config.datasource;

import javax.sql.DataSource;
//import io.shardingsphere.shardingjdbc.api.MasterSlaveDataSourceFactory;
//import io.shardingsphere.shardingjdbc.api.ShardingDataSourceFactory;
//import io.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
//import io.shardingsphere.shardingjdbc.spring.boot.common.SpringBootConfigMapConfigurationProperties;
//import io.shardingsphere.shardingjdbc.spring.boot.common.SpringBootPropertiesConfigurationProperties;
//import io.shardingsphere.shardingjdbc.spring.boot.masterslave.SpringBootMasterSlaveRuleConfigurationProperties;
//import io.shardingsphere.shardingjdbc.spring.boot.sharding.SpringBootShardingRuleConfigurationProperties;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.shardingsphere.shardingjdbc.api.yaml.YamlShardingDataSourceFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;


@Configuration // 注册到springboot容器中
@MapperScan(basePackages = "com.bottle.sample.passengerReport", sqlSessionFactoryRef = "PassengerReportSqlSessionFactory")
public class PassengerReportDataSourceConfig {

	/**
	 * @returnType:@return DataSource
	 */
	@Bean(name = "PassengerReportDataSource")
	public static DataSource getDataSource() throws SQLException, IOException {
		Resource resource = new ClassPathResource("sharding.yml");
		File file = resource.getFile();
		return YamlShardingDataSourceFactory.createDataSource(file);
	}
	/**
	 * @param: @param
	 *             dataSource
	 * @param: @return
	 * @param: @throws
	 *             Exception
	 * @returnType:@param dataSource
	 */
	@Bean(name = "PassengerReportSqlSessionFactory")
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("PassengerReportDataSource") DataSource dataSource)
			throws Exception {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		//mybatis写配置文件
//		 bean.setMapperLocations(
//		 new
//		 PathMatchingResourcePatternResolver().getResources("classpath:mybatis/mapper/test1/*.xml"));
		return bean.getObject();
	}

	/**
	 * @param: @param
	 *             dataSource
	 * @param: @return
	 * @param: @throws
	 *             Exception
	 * @returnType:@param dataSource
	 * @returnType:@return
	 * @returnType:@throws Exception SqlSessionFactory
	 */
	@Bean(name = "PassengerReportTransactionManager")
	public DataSourceTransactionManager testTransactionManager(@Qualifier("PassengerReportDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "PassengerReportSqlSessionTemplate")
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("PassengerReportSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
