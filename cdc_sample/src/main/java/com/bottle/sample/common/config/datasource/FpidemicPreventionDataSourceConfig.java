package com.bottle.sample.common.config.datasource;//package com.itmayiedu.datasource;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
@Configuration // 注册到springboot容器中
@MapperScan(basePackages = "com.bottle.sample.fpidemicPrevention", sqlSessionFactoryRef = "fpidemicPreventionSqlSessionFactory")
public class FpidemicPreventionDataSourceConfig {

	/**
	 * @returnType:@return DataSource
	 */
	@Bean(name = "fpidemicPreventionDataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	@Primary
	public DataSource testDataSource() {
		return DataSourceBuilder.create().build();
	}

	/**
	 * @param: @param
	 *             dataSource
	 * @param: @return
	 * @param: @throws
	 *             Exception
	 * @returnType:@param dataSource
	 */
	@Bean(name = "fpidemicPreventionSqlSessionFactory")
	@Primary
	public SqlSessionFactory testSqlSessionFactory(@Qualifier("fpidemicPreventionDataSource") DataSource dataSource)
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
	@Bean(name = "fpidemicPreventionTransactionManager")
	@Primary
	public DataSourceTransactionManager testTransactionManager(@Qualifier("fpidemicPreventionDataSource") DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean(name = "fpidemicPreventionSqlSessionTemplate")
	@Primary
	public SqlSessionTemplate testSqlSessionTemplate(
			@Qualifier("fpidemicPreventionSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

}
