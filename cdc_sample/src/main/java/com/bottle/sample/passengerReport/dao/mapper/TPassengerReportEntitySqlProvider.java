package com.bottle.sample.passengerReport.dao.mapper;

import com.bottle.sample.entity.TPassengerReportEntity;
import org.apache.ibatis.jdbc.SQL;

public class TPassengerReportEntitySqlProvider {

    public String insertSelective(TPassengerReportEntity record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_passenger_report_0");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getOid() != null) {
            sql.VALUES("oid", "#{oid,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            sql.VALUES("app_id", "#{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            sql.VALUES("uid", "#{uid,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.VALUES("phone", "#{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.VALUES("gender", "#{gender,jdbcType=CHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.VALUES("birthday", "#{birthday,jdbcType=DATE}");
        }
        
        if (record.getIdentityType() != null) {
            sql.VALUES("identity_type", "#{identityType,jdbcType=TINYINT}");
        }
        
        if (record.getIdentity() != null) {
            sql.VALUES("identity", "#{identity,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            sql.VALUES("city_code", "#{cityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getArea() != null) {
            sql.VALUES("area", "#{area,jdbcType=VARCHAR}");
        }
        
        if (record.getAreacode() != null) {
            sql.VALUES("areacode", "#{areacode,jdbcType=VARCHAR}");
        }
        
        if (record.getStreet() != null) {
            sql.VALUES("street", "#{street,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetCode() != null) {
            sql.VALUES("street_code", "#{streetCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCommunity() != null) {
            sql.VALUES("community", "#{community,jdbcType=VARCHAR}");
        }
        
        if (record.getCommunityCode() != null) {
            sql.VALUES("community_code", "#{communityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.VALUES("address", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getSymptom() != null) {
            sql.VALUES("symptom", "#{symptom,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingType() != null) {
            sql.VALUES("living_type", "#{livingType,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIfHelp() != null) {
            sql.VALUES("if_help", "#{ifHelp,jdbcType=TINYINT}");
        }
        
        if (record.getCollectorType() != null) {
            sql.VALUES("collector_type", "#{collectorType,jdbcType=TINYINT}");
        }
        
        if (record.getTemperature() != null) {
            sql.VALUES("temperature", "#{temperature,jdbcType=TINYINT}");
        }
        
        if (record.getHospitalCheck() != null) {
            sql.VALUES("hospital_check", "#{hospitalCheck,jdbcType=TINYINT}");
        }
        
        if (record.getSymptomDscr() != null) {
            sql.VALUES("symptom_dscr", "#{symptomDscr,jdbcType=VARCHAR}");
        }
        
        if (record.getPersonType() != null) {
            sql.VALUES("person_type", "#{personType,jdbcType=TINYINT}");
        }
        
        if (record.getQuarantineCheck() != null) {
            sql.VALUES("quarantine_check", "#{quarantineCheck,jdbcType=TINYINT}");
        }
        
        if (record.getSocialCreditId() != null) {
            sql.VALUES("social_credit_id", "#{socialCreditId,jdbcType=VARCHAR}");
        }
        
        if (record.getCompany() != null) {
            sql.VALUES("company", "#{company,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentLocation() != null) {
            sql.VALUES("current_location", "#{currentLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentLocationCode() != null) {
            sql.VALUES("current_location_code", "#{currentLocationCode,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.VALUES("version", "#{version,jdbcType=VARCHAR}");
        }
        
        if (record.getDataFrom() != null) {
            sql.VALUES("data_from", "#{dataFrom,jdbcType=TINYINT}");
        }
        
        if (record.getCode() != null) {
            sql.VALUES("code", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getVillage() != null) {
            sql.VALUES("village", "#{village,jdbcType=VARCHAR}");
        }
        
        if (record.getIfLivingSz() != null) {
            sql.VALUES("if_living_sz", "#{ifLivingSz,jdbcType=TINYINT}");
        }
        
        if (record.getIfWorkingSz() != null) {
            sql.VALUES("if_working_sz", "#{ifWorkingSz,jdbcType=TINYINT}");
        }
        
        if (record.getHospitalCheckResult() != null) {
            sql.VALUES("hospital_check_result", "#{hospitalCheckResult,jdbcType=TINYINT}");
        }
        
        if (record.getIfEnter() != null) {
            sql.VALUES("if_enter", "#{ifEnter,jdbcType=TINYINT}");
        }
        
        if (record.getPersonKey() != null) {
            sql.VALUES("person_key", "#{personKey,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TPassengerReportEntity record) {
        SQL sql = new SQL();
        sql.UPDATE("t_passenger_report_0");
        
        if (record.getOid() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        
        if (record.getAppId() != null) {
            sql.SET("app_id = #{appId,jdbcType=VARCHAR}");
        }
        
        if (record.getUid() != null) {
            sql.SET("uid = #{uid,jdbcType=BIGINT}");
        }
        
        if (record.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("phone = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getGender() != null) {
            sql.SET("gender = #{gender,jdbcType=CHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("birthday = #{birthday,jdbcType=DATE}");
        }
        
        if (record.getIdentityType() != null) {
            sql.SET("identity_type = #{identityType,jdbcType=TINYINT}");
        }
        
        if (record.getIdentity() != null) {
            sql.SET("identity = #{identity,jdbcType=VARCHAR}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getCityCode() != null) {
            sql.SET("city_code = #{cityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getArea() != null) {
            sql.SET("area = #{area,jdbcType=VARCHAR}");
        }
        
        if (record.getAreacode() != null) {
            sql.SET("areacode = #{areacode,jdbcType=VARCHAR}");
        }
        
        if (record.getStreet() != null) {
            sql.SET("street = #{street,jdbcType=VARCHAR}");
        }
        
        if (record.getStreetCode() != null) {
            sql.SET("street_code = #{streetCode,jdbcType=VARCHAR}");
        }
        
        if (record.getCommunity() != null) {
            sql.SET("community = #{community,jdbcType=VARCHAR}");
        }
        
        if (record.getCommunityCode() != null) {
            sql.SET("community_code = #{communityCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("address = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getSymptom() != null) {
            sql.SET("symptom = #{symptom,jdbcType=VARCHAR}");
        }
        
        if (record.getLivingType() != null) {
            sql.SET("living_type = #{livingType,jdbcType=TINYINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIfHelp() != null) {
            sql.SET("if_help = #{ifHelp,jdbcType=TINYINT}");
        }
        
        if (record.getCollectorType() != null) {
            sql.SET("collector_type = #{collectorType,jdbcType=TINYINT}");
        }
        
        if (record.getTemperature() != null) {
            sql.SET("temperature = #{temperature,jdbcType=TINYINT}");
        }
        
        if (record.getHospitalCheck() != null) {
            sql.SET("hospital_check = #{hospitalCheck,jdbcType=TINYINT}");
        }
        
        if (record.getSymptomDscr() != null) {
            sql.SET("symptom_dscr = #{symptomDscr,jdbcType=VARCHAR}");
        }
        
        if (record.getPersonType() != null) {
            sql.SET("person_type = #{personType,jdbcType=TINYINT}");
        }
        
        if (record.getQuarantineCheck() != null) {
            sql.SET("quarantine_check = #{quarantineCheck,jdbcType=TINYINT}");
        }
        
        if (record.getSocialCreditId() != null) {
            sql.SET("social_credit_id = #{socialCreditId,jdbcType=VARCHAR}");
        }
        
        if (record.getCompany() != null) {
            sql.SET("company = #{company,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentLocation() != null) {
            sql.SET("current_location = #{currentLocation,jdbcType=VARCHAR}");
        }
        
        if (record.getCurrentLocationCode() != null) {
            sql.SET("current_location_code = #{currentLocationCode,jdbcType=VARCHAR}");
        }
        
        if (record.getVersion() != null) {
            sql.SET("version = #{version,jdbcType=VARCHAR}");
        }
        
        if (record.getDataFrom() != null) {
            sql.SET("data_from = #{dataFrom,jdbcType=TINYINT}");
        }
        
        if (record.getCode() != null) {
            sql.SET("code = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getVillage() != null) {
            sql.SET("village = #{village,jdbcType=VARCHAR}");
        }
        
        if (record.getIfLivingSz() != null) {
            sql.SET("if_living_sz = #{ifLivingSz,jdbcType=TINYINT}");
        }
        
        if (record.getIfWorkingSz() != null) {
            sql.SET("if_working_sz = #{ifWorkingSz,jdbcType=TINYINT}");
        }
        
        if (record.getHospitalCheckResult() != null) {
            sql.SET("hospital_check_result = #{hospitalCheckResult,jdbcType=TINYINT}");
        }
        
        if (record.getIfEnter() != null) {
            sql.SET("if_enter = #{ifEnter,jdbcType=TINYINT}");
        }
        
        if (record.getPersonKey() != null) {
            sql.SET("person_key = #{personKey,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}