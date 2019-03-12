package com.jtl.designpatterns.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * 作者:jtl
 * 日期:Created in 2019/3/12 16:42
 * 描述:
 * 更改:
 */
public class SingletonManager {
    private static Map<String, Object> sObjectMap = new HashMap<String, Object>();

    private SingletonManager() {
    }

    public static void registerInstance(String key, Object instance) {
        if (instance == null)
            return;
        if (!sObjectMap.containsKey(key)) {
            sObjectMap.put(key, instance);
        }
    }

    public static Object getInstance(String key) {
        return sObjectMap.get(key);
    }
}
