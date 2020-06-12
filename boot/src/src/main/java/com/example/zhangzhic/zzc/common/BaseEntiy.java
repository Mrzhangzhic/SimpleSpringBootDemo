package com.example.zhangzhic.zzc.common;

import javax.xml.crypto.Data;
import java.io.Serializable;
import java.util.Date;

public class BaseEntiy implements Serializable {
    private Data createDataTime;
    private String createUserId;
    private Date updateDataTime;
    private String updateUserId;
    private Boolean delete;

    public Data getCreateDataTime() {
        return createDataTime;
    }

    public void setCreateDataTime(Data createDataTime) {
        this.createDataTime = createDataTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getUpdateDataTime() {
        return updateDataTime;
    }

    public void setUpdateDataTime(Date updateDataTime) {
        this.updateDataTime = updateDataTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }
}
