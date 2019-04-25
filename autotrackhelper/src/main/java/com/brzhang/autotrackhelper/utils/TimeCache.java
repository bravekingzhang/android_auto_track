package com.brzhang.autotrackhelper.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:xishuang
 * Date:2018.01.10
 * Des:计时类，编译器加入指定方法中
 */
public class TimeCache {
    public static Map<String, Long> sStartTime = new HashMap<>();
    public static Map<String, Long> sEndTime = new HashMap<>();

    public static void setStartTime(String methodName, long time) {
        sStartTime.put(methodName, time);
    }

    public static void setEndTime(String methodName, long time) {
        sEndTime.put(methodName, time);
    }

    public static String getCostTime(String annotation, String methodName) {

        long start = sStartTime.get(methodName);
        long end = sEndTime.get(methodName);
        long dex = (end - start);
        return "[" + annotation + "]   注解的方法 [" + methodName + "] 耗时 [" + dex + "] ms";
    }
}
