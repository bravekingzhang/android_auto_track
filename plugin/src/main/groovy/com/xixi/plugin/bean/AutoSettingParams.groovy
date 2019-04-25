package com.xixi.plugin.bean

/**
 * 用于build.gradle中的参数传递
 */
public class AutoSettingParams {

    String name = '字节码插件'
    /**
     * 是否是Debug模式进行日志打印
     */
    boolean isDebug = false
    /**
     * 是否打开日志采集的全埋点
     */
    boolean isOpenLogTrack = true
    /**
     * 用户自定义功能
     */
    List<Map<String, Object>> matchData = new ArrayList<>()

    /**
     * 自动埋点帮助类文件
     */
    String log_analytics_base = ''
    /**
     * 需要手动过滤的包
     */
    List<String> exclude = []
    /**
     * 需要手动添加的包
     */
    List<String> include = []
}