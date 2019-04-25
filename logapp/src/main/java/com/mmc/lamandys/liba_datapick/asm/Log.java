package com.mmc.lamandys.liba_datapick.asm;


public class Log {

    public static void notifyInsert(String annotation, String method) {
        System.out.println("被【" + annotation + "】注解的方法【" + method + "】已添加");
    }
}
