package com.bottle.sample.fpidemicPrevention.dao.mapper;

import com.bottle.sample.common.util.MyMapper;
import com.bottle.sample.entity.TInstitutionInfoEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * 组织信息
 *mybatis tk 操作类
 * @author nyd
 * @email 1627815280@qq.com
 * @date 2020-04-27 10:00:33
 */
@Mapper
public interface TInstitutionInfoMapper extends MyMapper<TInstitutionInfoEntity> {
    @Select({
            "select id from t_institution_info where name like '%${name}%'"
    })
    List<Long> selectByInstitutionName(@Param("name") String name);
}
