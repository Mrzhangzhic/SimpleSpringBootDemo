package com.example.zhangzhic.zzc.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "返回类")
public class Result<T> {
    @ApiModelProperty(value = "code")
    private String code;
    @ApiModelProperty(value = "描述")
    private String message;
    @ApiModelProperty(value = "对象")
    private T data;
    @ApiModelProperty(value = "是否成功")
    private boolean success;
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Result() {

    }
}
