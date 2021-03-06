package com.mmall.common;

/**
 * @Author liizzz
 * @Data 2019/8/11 12:26
 */
public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(-1,"ERROR"),
    NEED_LOGIN(-100,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(-200,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;

    private ResponseCode(int code, String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }
    public String getDesc() {
        return desc;
    }
}
