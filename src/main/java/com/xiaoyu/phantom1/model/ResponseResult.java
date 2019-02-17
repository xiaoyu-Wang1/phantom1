package com.xiaoyu.phantom1.model;

/**
 * 返回结果的基类
 */
public class ResponseResult {
    private Integer code;
    private String desc;
    private String data;

    public ResponseResult(Integer code, String desc, String data) {
        this.code = code;
        this.desc = desc;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
