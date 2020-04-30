package com.bottle.sample.passengerReport.dao.mapper;

import com.bottle.sample.entity.TPassengerReportEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TPassengerReportEntityMapper {
    @Delete({
        "delete from t_passenger_report_0",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into t_passenger_report_0 (id, oid, ",
        "app_id, uid, username, ",
        "phone, gender, birthday, ",
        "identity_type, identity, ",
        "city, city_code, ",
        "area, areacode, ",
        "street, street_code, ",
        "community, community_code, ",
        "address, symptom, ",
        "living_type, create_time, ",
        "if_help, collector_type, ",
        "temperature, hospital_check, ",
        "symptom_dscr, person_type, ",
        "quarantine_check, social_credit_id, ",
        "company, current_location, ",
        "current_location_code, version, ",
        "data_from, code, ",
        "village, if_living_sz, ",
        "if_working_sz, hospital_check_result, ",
        "if_enter, person_key)",
        "values (#{id,jdbcType=BIGINT}, #{oid,jdbcType=VARCHAR}, ",
        "#{appId,jdbcType=VARCHAR}, #{uid,jdbcType=BIGINT}, #{username,jdbcType=VARCHAR}, ",
        "#{phone,jdbcType=VARCHAR}, #{gender,jdbcType=CHAR}, #{birthday,jdbcType=DATE}, ",
        "#{identityType,jdbcType=TINYINT}, #{identity,jdbcType=VARCHAR}, ",
        "#{city,jdbcType=VARCHAR}, #{cityCode,jdbcType=VARCHAR}, ",
        "#{area,jdbcType=VARCHAR}, #{areacode,jdbcType=VARCHAR}, ",
        "#{street,jdbcType=VARCHAR}, #{streetCode,jdbcType=VARCHAR}, ",
        "#{community,jdbcType=VARCHAR}, #{communityCode,jdbcType=VARCHAR}, ",
        "#{address,jdbcType=VARCHAR}, #{symptom,jdbcType=VARCHAR}, ",
        "#{livingType,jdbcType=TINYINT}, #{createTime,jdbcType=TIMESTAMP}, ",
        "#{ifHelp,jdbcType=TINYINT}, #{collectorType,jdbcType=TINYINT}, ",
        "#{temperature,jdbcType=TINYINT}, #{hospitalCheck,jdbcType=TINYINT}, ",
        "#{symptomDscr,jdbcType=VARCHAR}, #{personType,jdbcType=TINYINT}, ",
        "#{quarantineCheck,jdbcType=TINYINT}, #{socialCreditId,jdbcType=VARCHAR}, ",
        "#{company,jdbcType=VARCHAR}, #{currentLocation,jdbcType=VARCHAR}, ",
        "#{currentLocationCode,jdbcType=VARCHAR}, #{version,jdbcType=VARCHAR}, ",
        "#{dataFrom,jdbcType=TINYINT}, #{code,jdbcType=VARCHAR}, ",
        "#{village,jdbcType=VARCHAR}, #{ifLivingSz,jdbcType=TINYINT}, ",
        "#{ifWorkingSz,jdbcType=TINYINT}, #{hospitalCheckResult,jdbcType=TINYINT}, ",
        "#{ifEnter,jdbcType=TINYINT}, #{personKey,jdbcType=VARCHAR})"
    })
    int insert(TPassengerReportEntity record);

    @InsertProvider(type= TPassengerReportEntitySqlProvider.class, method="insertSelective")
    int insertSelective(TPassengerReportEntity record);

    @Select({
        "select",
        "id, oid, app_id, uid, username, phone, gender, birthday, identity_type, identity, ",
        "city, city_code, area, areacode, street, street_code, community, community_code, ",
        "address, symptom, living_type, create_time, if_help, collector_type, temperature, ",
        "hospital_check, symptom_dscr, person_type, quarantine_check, social_credit_id, ",
        "company, current_location, current_location_code, version, data_from, code, ",
        "village, if_living_sz, if_working_sz, hospital_check_result, if_enter, person_key",
        "from t_passenger_report_0",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="oid", property="oid", jdbcType=JdbcType.VARCHAR),
        @Result(column="app_id", property="appId", jdbcType=JdbcType.VARCHAR),
        @Result(column="uid", property="uid", jdbcType=JdbcType.BIGINT),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.VARCHAR),
        @Result(column="gender", property="gender", jdbcType=JdbcType.CHAR),
        @Result(column="birthday", property="birthday", jdbcType=JdbcType.DATE),
        @Result(column="identity_type", property="identityType", jdbcType=JdbcType.TINYINT),
        @Result(column="identity", property="identity", jdbcType=JdbcType.VARCHAR),
        @Result(column="city", property="city", jdbcType=JdbcType.VARCHAR),
        @Result(column="city_code", property="cityCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="area", property="area", jdbcType=JdbcType.VARCHAR),
        @Result(column="areacode", property="areacode", jdbcType=JdbcType.VARCHAR),
        @Result(column="street", property="street", jdbcType=JdbcType.VARCHAR),
        @Result(column="street_code", property="streetCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="community", property="community", jdbcType=JdbcType.VARCHAR),
        @Result(column="community_code", property="communityCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="address", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="symptom", property="symptom", jdbcType=JdbcType.VARCHAR),
        @Result(column="living_type", property="livingType", jdbcType=JdbcType.TINYINT),
        @Result(column="create_time", property="createTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="if_help", property="ifHelp", jdbcType=JdbcType.TINYINT),
        @Result(column="collector_type", property="collectorType", jdbcType=JdbcType.TINYINT),
        @Result(column="temperature", property="temperature", jdbcType=JdbcType.TINYINT),
        @Result(column="hospital_check", property="hospitalCheck", jdbcType=JdbcType.TINYINT),
        @Result(column="symptom_dscr", property="symptomDscr", jdbcType=JdbcType.VARCHAR),
        @Result(column="person_type", property="personType", jdbcType=JdbcType.TINYINT),
        @Result(column="quarantine_check", property="quarantineCheck", jdbcType=JdbcType.TINYINT),
        @Result(column="social_credit_id", property="socialCreditId", jdbcType=JdbcType.VARCHAR),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_location", property="currentLocation", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_location_code", property="currentLocationCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_from", property="dataFrom", jdbcType=JdbcType.TINYINT),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="village", property="village", jdbcType=JdbcType.VARCHAR),
        @Result(column="if_living_sz", property="ifLivingSz", jdbcType=JdbcType.TINYINT),
        @Result(column="if_working_sz", property="ifWorkingSz", jdbcType=JdbcType.TINYINT),
        @Result(column="hospital_check_result", property="hospitalCheckResult", jdbcType=JdbcType.TINYINT),
        @Result(column="if_enter", property="ifEnter", jdbcType=JdbcType.TINYINT),
        @Result(column="person_key", property="personKey", jdbcType=JdbcType.VARCHAR)
    })
    TPassengerReportEntity selectByPrimaryKey(Long id);

    @UpdateProvider(type= TPassengerReportEntitySqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TPassengerReportEntity record);

    @Update({
        "update t_passenger_report_0",
        "set oid = #{oid,jdbcType=VARCHAR},",
          "app_id = #{appId,jdbcType=VARCHAR},",
          "uid = #{uid,jdbcType=BIGINT},",
          "username = #{username,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=VARCHAR},",
          "gender = #{gender,jdbcType=CHAR},",
          "birthday = #{birthday,jdbcType=DATE},",
          "identity_type = #{identityType,jdbcType=TINYINT},",
          "identity = #{identity,jdbcType=VARCHAR},",
          "city = #{city,jdbcType=VARCHAR},",
          "city_code = #{cityCode,jdbcType=VARCHAR},",
          "area = #{area,jdbcType=VARCHAR},",
          "areacode = #{areacode,jdbcType=VARCHAR},",
          "street = #{street,jdbcType=VARCHAR},",
          "street_code = #{streetCode,jdbcType=VARCHAR},",
          "community = #{community,jdbcType=VARCHAR},",
          "community_code = #{communityCode,jdbcType=VARCHAR},",
          "address = #{address,jdbcType=VARCHAR},",
          "symptom = #{symptom,jdbcType=VARCHAR},",
          "living_type = #{livingType,jdbcType=TINYINT},",
          "create_time = #{createTime,jdbcType=TIMESTAMP},",
          "if_help = #{ifHelp,jdbcType=TINYINT},",
          "collector_type = #{collectorType,jdbcType=TINYINT},",
          "temperature = #{temperature,jdbcType=TINYINT},",
          "hospital_check = #{hospitalCheck,jdbcType=TINYINT},",
          "symptom_dscr = #{symptomDscr,jdbcType=VARCHAR},",
          "person_type = #{personType,jdbcType=TINYINT},",
          "quarantine_check = #{quarantineCheck,jdbcType=TINYINT},",
          "social_credit_id = #{socialCreditId,jdbcType=VARCHAR},",
          "company = #{company,jdbcType=VARCHAR},",
          "current_location = #{currentLocation,jdbcType=VARCHAR},",
          "current_location_code = #{currentLocationCode,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=VARCHAR},",
          "data_from = #{dataFrom,jdbcType=TINYINT},",
          "code = #{code,jdbcType=VARCHAR},",
          "village = #{village,jdbcType=VARCHAR},",
          "if_living_sz = #{ifLivingSz,jdbcType=TINYINT},",
          "if_working_sz = #{ifWorkingSz,jdbcType=TINYINT},",
          "hospital_check_result = #{hospitalCheckResult,jdbcType=TINYINT},",
          "if_enter = #{ifEnter,jdbcType=TINYINT},",
          "person_key = #{personKey,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(TPassengerReportEntity record);
}