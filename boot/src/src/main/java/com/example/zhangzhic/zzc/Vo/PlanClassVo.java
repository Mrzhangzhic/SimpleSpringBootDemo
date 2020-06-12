package com.example.zhangzhic.zzc.Vo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * plan_class
 * @author 
 */

public class PlanClassVo implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 产品形式id
     */
    private String curriculumTemplateProductId;

    /**
     * 1-7 代表周一到周日
     */
    private Integer startWeek;

    /**
     * 1-7 代表周一到周日
     */
    private Integer endWeek;

    /**
     * 上课时间
     */
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date startClassTime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private Date endClassTime;

    /**
     * 0未删除，1删除
     */
    private Boolean delete;

    private Date createDataTime;

    private String createUserId;

    private Date updateDataTime;

    private String updateUserId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurriculumTemplateProductId() {
        return curriculumTemplateProductId;
    }

    public void setCurriculumTemplateProductId(String curriculumTemplateProductId) {
        this.curriculumTemplateProductId = curriculumTemplateProductId;
    }

    public Integer getStartWeek() {
        return startWeek;
    }

    public void setStartWeek(Integer startWeek) {
        this.startWeek = startWeek;
    }

    public Integer getEndWeek() {
        return endWeek;
    }

    public void setEndWeek(Integer endWeek) {
        this.endWeek = endWeek;
    }

    public Date getStartClassTime() {
        return startClassTime;
    }

    public void setStartClassTime(Date startClassTime) {
        this.startClassTime = startClassTime;
    }

    public Date getEndClassTime() {
        return endClassTime;
    }

    public void setEndClassTime(Date endClassTime) {
        this.endClassTime = endClassTime;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        delete = delete;
    }

    public Date getCreateDataTime() {
        return createDataTime;
    }

    public void setCreateDataTime(Date createDataTime) {
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

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
}