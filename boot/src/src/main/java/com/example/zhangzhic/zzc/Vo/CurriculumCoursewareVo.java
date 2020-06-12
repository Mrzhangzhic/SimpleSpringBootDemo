package com.example.zhangzhic.zzc.Vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * courseware
 * @author 
 */
@ApiModel(value="CurriculumCoursewareVo对象",description = "课件")
@Data
public class CurriculumCoursewareVo implements Serializable {
    @ApiModelProperty(value = "主键",name = "id",required = true,dataType = "String")
    private Integer id;

    /**
     * 课程id
     */
    @ApiModelProperty(value = "课程Id",name = "curriculumId",required = true,dataType = "Integer")
    private Integer curriculumId;
    @ApiModelProperty(value = "总深度",name = "totalLevel",required = true,dataType = "Integer")
    private Integer totalLevel;
    @ApiModelProperty(value = "深度",name = "level",required = true,dataType = "Integer")
    private Integer level;

    /**
     * 视频文件
     */
    @ApiModelProperty(value = "视频URl",name = "videoUrl",required = true,dataType = "Integer")
    private String videoUrl;

    /**
     * 课件文件
     */
    private String fileUrl;

    /**
     * 是否通过审核0：未通过，1通过
     */
    private Boolean isAuditing;

    /**
     * 主讲老师
     */
    private String mainTeacher;
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

    public Integer getCurriculumId() {
        return curriculumId;
    }

    public void setCurriculumId(Integer curriculumId) {
        this.curriculumId = curriculumId;
    }

    public Integer getTotalLevel() {
        return totalLevel;
    }

    public void setTotalLevel(Integer totalLevel) {
        this.totalLevel = totalLevel;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public Boolean getAuditing() {
        return isAuditing;
    }

    public void setAuditing(Boolean auditing) {
        isAuditing = auditing;
    }

    public String getMainTeacher() {
        return mainTeacher;
    }

    public void setMainTeacher(String mainTeacher) {
        this.mainTeacher = mainTeacher;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
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
}