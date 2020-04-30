package com.bottle.sample.common.util;


import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Slf4j
public class RedisUtil {

    final public static int FIFTEN = 900;


    /**
     * @Description: 生成唯一key
     * @author chenqiang
     * @date 2019/1/25 11:13
     */
    public static String buildKey(Object o){
        return DigestUtils.md5Hex(JSON.toJSONString(o));
    }

    public static String buildKey(String o){
        return DigestUtils.md5Hex(o);
    }




    /**
     * 加锁
     * @param key
     * @param value 当前时间+超时时间
     * @return
     */
    public static boolean lock(StringRedisTemplate redisTemplate,String key, String value) {
        if(redisTemplate.opsForValue().setIfAbsent(key, value)) {
            return true;
        }
        String currentValue = redisTemplate.opsForValue().get(key);
        //如果锁过期
        if (!StringUtils.isEmpty(currentValue)
                && Long.parseLong(currentValue) < System.currentTimeMillis()) {
            //获取上一个锁的时间
            String oldValue = redisTemplate.opsForValue().getAndSet(key, value);
            if (!StringUtils.isEmpty(oldValue) && oldValue.equals(currentValue)) {
                return true;
            }
        }

        return false;
    }

    /**
     * 解锁
     * @param redisTemplate
     * @param key
     * @param value 当前时间+超时时间
     */
    public static void unlock(StringRedisTemplate redisTemplate,String key, String value) {
        try {
            String currentValue = redisTemplate.opsForValue().get(key);
            if (!StringUtils.isEmpty(currentValue) && currentValue.equals(value)) {
                redisTemplate.opsForValue().getOperations().delete(key);
            }
        }catch (Exception e) {
            log.error("解锁异常, {}", e);
        }
    }

    /**
     * 将String类型值写入redis,不设置过期时间
     * @param redisTemplate
     * @param key
     * @param value
     */
    public static boolean set(StringRedisTemplate redisTemplate,String key, String value){
        boolean result = false;
        try {
            if(StringUtils.isEmpty(value)){
                return false;
            }
            redisTemplate.opsForValue().set(key,value);
            result = true;
        } catch (Exception e) {
            log.error("【写入redis失败】:{}",e.getMessage());
        }

        return result;
    }

    /**
     * 将String类型值写入redis,不设置过期时间
     * @param redisTemplate
     * @param key
     */
    public static boolean set(StringRedisTemplate redisTemplate,String key){
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key,"");
            result = true;
        } catch (Exception e) {
            log.error("【写入redis失败】:{}",e.getMessage());
        }
        return result;
    }

    /**
     * 将String类型值写入redis,设置过期时间（单位秒）
     * @param redisTemplate
     * @param key
     * @param expire
     */
    public static boolean set(StringRedisTemplate redisTemplate,String key,long expire){
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key,"");
            redisTemplate.expire(key,expire, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            log.error("【写入redis失败】:{}",e.getMessage());
        }
        return result;
    }

    /**
     * 将key 存入redis,设置过期时间
     * @param redisTemplate
     * @param key
     * @param expire 过期时间
     * @param timeUnit 时间单位
     */
    public static boolean set(StringRedisTemplate redisTemplate,String key,long expire,TimeUnit timeUnit){
        boolean result = false;
        try {
            redisTemplate.opsForValue().set(key,"");
            redisTemplate.expire(key,expire,timeUnit);
            result = true;
        } catch (Exception e) {
            log.error("【写入redis失败】:{}",e.getMessage());
        }
        return result;
    }
    /**
     * 以键值对的形式存入redis,设置过期时间(单位秒)
     * @param redisTemplate
     * @param key 键
     * @param value 值
     * @param expire 过期时间
     */
    public static boolean set(StringRedisTemplate redisTemplate,String key, String value,long expire){
        boolean result = false;
        try {
            if(StringUtils.isEmpty(value)){
                return false;
            }
            redisTemplate.opsForValue().set(key,value);
            redisTemplate.expire(key,expire, TimeUnit.SECONDS);
            result = true;
        } catch (Exception e) {
            log.error("【写入redis缓存，设置过期时间异常】:{}",e.getMessage());
        }
        return result;
    }

    /**
     * 以键值对的形式存入redis,设置过期时间(单位秒)
     * @param redisTemplate
     * @param key 键
     * @param value 值
     * @param expire 过期时间
     * @param timeUnit 时间单位
     */
    public static boolean set(StringRedisTemplate redisTemplate,String key, String value,long expire,TimeUnit timeUnit){
        boolean result = false;
        try {
            if(StringUtils.isEmpty(value)){
                return false;
            }
            redisTemplate.opsForValue().set(key,value);
            redisTemplate.expire(key,expire, timeUnit);
            result = true;
        } catch (Exception e) {
            log.error("【写入redis缓存，设置过期时间异常】:{}",e.getMessage());
        }
        return result;
    }


    /**
     * 读取redis缓存
     * @param key
     * @return
     */
    public static String get(StringRedisTemplate redisTemplate,String key){
        String result = null;
        try {
            result = redisTemplate.opsForValue().get(key);
        } catch (Exception e) {
            log.error("【读取redis缓存失败！错误信息为】：{}",e.getMessage());
        }
        return result;
    }

    /**
     * 获取int类型数值
     * @param redisTemplate
     * @param key
     * @return
     */
    public static Integer getInt(StringRedisTemplate redisTemplate,String key){
        try {
            String value = get(redisTemplate,key);
            if(!StringUtils.isEmpty(value)){
                return Integer.parseInt(value);
            }
        } catch (NumberFormatException e) {
            log.error("【redis读取的数据类型不匹配】：{}",e.getMessage());
        }
        return 0;
    }

    /**
     * redis 根据key模糊查询
     * @param key
     * @return
     */
    public static List<String> like(StringRedisTemplate redisTemplate,String key){
        try {
            key = key+"*";
            Set<String> keys= redisTemplate.keys(key);
            return getList(redisTemplate,new ArrayList<>(keys));
        } catch (Exception e) {
            log.error("【根据key 模糊查询失败】：{}",e.getMessage());
        }
        return null;
    }

    /**
     * 根据keys批量获取redis值
     * @param redisTemplate
     * @param keys
     * @return
     */
    public static List<String> getList(StringRedisTemplate redisTemplate,List<String> keys){
        List<String> list = null;
        try {
            list = redisTemplate.opsForValue().multiGet(keys);
        } catch (Exception e) {
            log.error("【批量获取redis数据失败】：{}",e.getMessage());
        }
        return list;
    }
 /**
     * 根据map批量插入redis
     * @param redisTemplate
     * @param map
     * @return
     */
    public static void multiSet(StringRedisTemplate redisTemplate, Map<String , String> map){
        try {
            redisTemplate.opsForValue().multiSet(map);
        } catch (Exception e) {
            log.error("【批量插入redis数据失败】：{}",e.getMessage());
            throw new RuntimeException("redis连接超时");
        }
    }


    /**
     * 判断redis缓存中是否有对应的key
     * @param key
     * @return
     */
    public static boolean exists(StringRedisTemplate redisTemplate, String key){
        boolean result = false;
        try {
            result = redisTemplate.hasKey(key);
        } catch (Exception e) {
            log.error("判断redis缓存中是否有对应的key失败！错误信息为：{}",e.getMessage());
        }
        return result;
    }

    /**
     * redis根据key删除对应的value
     * @param key
     * @return
     */
    public static boolean remove(StringRedisTemplate redisTemplate,String key){
        boolean result = false;
        try {
            if(exists(redisTemplate,key)){
                redisTemplate.delete(key);
            }
            result = true;
        } catch (Exception e) {
            log.error("【redis根据key删除对应的value异常】：{}",e.getMessage());
        }
        return result;
    }

    /**
     * redis根据keys批量删除对应的value
     * @param keys
     * @return
     */
    public static boolean remove(StringRedisTemplate redisTemplate,String... keys){
        boolean result = false;
        try {
            for(String key : keys){
                remove(redisTemplate,key);
            }
            result = true;
        } catch (Exception e) {
            log.error("【redis key批量删除异常】：{}",e.getMessage());
        }
        return result;
    }

    /**
     * redis 模糊删除
     * @param redisTemplate
     * @param prefix
     * @return
     */
    public static boolean removeLike(StringRedisTemplate redisTemplate,String prefix){
        boolean result = false;
        try {
            redisTemplate.delete(redisTemplate.keys(prefix+"*"));
            result = true;
        } catch (Exception e) {
            log.error("【redis key模糊删除异常】：{}",e.getMessage());
        }
        return result;
    }

    /**
     * redis根据keys获取key过期时间
     * @param redisTemplate
     * @param key
     * @return
     */
    public static Long getExpire(StringRedisTemplate redisTemplate,String key){
        Long result = null;
        try {
            return redisTemplate.getExpire(key);
        } catch (Exception e) {
            log.error("【redis 获取key过期时间异常】：{}",e.getMessage());
        }
        return null;
    }


    /**
     * redis 统计缓存key次数
     * @param redisTemplate
     * @param key
     * @return
     */
    public static boolean countKey(StringRedisTemplate redisTemplate,String key){
        boolean isSuccess = false;
        try {
            int count = RedisUtil.getInt(redisTemplate,key);
            if(count<3){
                count++;
                RedisUtil.set(redisTemplate,key,String.valueOf(count));
            }else{
                isSuccess = true;
                RedisUtil.remove(redisTemplate,key);
            }
        } catch (Exception e) {
            log.error("【redis 统计缓存key次数异常】：{}",e.getMessage());
        }
        return isSuccess;
    }


    /**
     *
     * 功能描述:创建线程插入redis
     *
     * @param:
     * @return:
     * @auther: caimq
     * @date: 2018/12/4 10:45
     */
    public static boolean multiSetNewThread(StringRedisTemplate redisTemplate,Map<String , String> map , Integer flag){
        try {
            flag ++;
            if(flag < 5){
                RedisUtil.multiSet(redisTemplate , map);
            }
            return true;
        }catch (Exception e){
            log.error("【存入redis异常第"+flag+"次】：{}",e.getMessage());
            return multiSetNewThread(redisTemplate,map,flag);
        }
    }




}
