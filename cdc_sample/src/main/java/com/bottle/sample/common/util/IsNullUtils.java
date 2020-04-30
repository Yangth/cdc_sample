package com.bottle.sample.common.util;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class IsNullUtils {
    /**
     * 判空方法工具类
     *
     */
        @SuppressWarnings("rawtypes")
        public static boolean isEmpty(Object o) {
            if (o == null) {
                return true;
            }
            if (o instanceof String) {
                if (o.toString().trim().equals("")) {
                    return true;
                }
                if (o.equals("null") || o.equals("NULL")) {
                    return true;
                }
            } else if (o instanceof List) {
                if (((List) o).size() == 0) {
                    return true;
                }
            } else if (o instanceof Map) {
                if (((Map) o).size() == 0) {
                    return true;
                }
            } else if (o instanceof Set) {
                if (((Set) o).size() == 0) {
                    return true;
                }
            } else if (o instanceof Object[]) {
                if (((Object[]) o).length == 0) {
                    return true;
                }
            } else if (o instanceof int[]) {
                if (((int[]) o).length == 0) {
                    return true;
                }
            } else if (o instanceof long[]) {
                if (((long[]) o).length == 0) {
                    return true;
                }
            }
            return false;
        }




}
