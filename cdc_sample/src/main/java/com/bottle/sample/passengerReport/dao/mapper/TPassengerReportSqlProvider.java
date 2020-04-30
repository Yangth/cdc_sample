package com.bottle.sample.passengerReport.dao.mapper;

import com.bottle.sample.vo.TPassengerReportVo;
import org.apache.ibatis.jdbc.SQL;

public class TPassengerReportSqlProvider {

    public String getTPassengerReportSelective(TPassengerReportVo vo) {
        SQL sql = new SQL();
        sql.SELECT("*");
        sql.FROM("t_passenger_report");

        if (vo.getOid() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getAppId() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getUid() != null && vo.getUid().intValue() != 0) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getUsername() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getPhone() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getGender() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getBirthday() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getIdentityType() != null && vo.getIdentityType() != 0) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getIdentity() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getCity() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getCityCode() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getArea() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getAreacode() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        if (vo.getStreet() != null) {
            sql.SET("oid = #{oid,jdbcType=VARCHAR}");
        }
        return sql.toString();
    }
}
