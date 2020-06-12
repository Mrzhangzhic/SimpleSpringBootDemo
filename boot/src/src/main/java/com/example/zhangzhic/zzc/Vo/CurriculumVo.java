package com.example.zhangzhic.zzc.Vo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * curriculum
 * @author 
 */
@Api(value = "课程表")

@Data
@ApiModel(value="CurriculumVo对象",description = "课程对象")
public class CurriculumVo implements Serializable {
    @ApiModelProperty(value = "主键",name = "id",required = true)
    private Integer id;

    /**
     * 课程模板Id
     */
    @ApiModelProperty(name ="课程模板Id",value = "CurriculumTemplateId",required = true)
    private Integer curriculumTemplateId;

    /**
     * 课程模板名
     */
    @ApiModelProperty(value = "课程模板名称",required = true)
    private String curriculumTemplateName;

    /**
     * 课程介绍
     */
    private String curriculumIntroduce;

    /**
     * 封面id
     */
    private Integer coverId;

    /**
     * 主讲老师Id
     */
    private Integer lecturerId;

    /**
     * 主讲老师
     */
    private String lecturerName;

    /**
     * 邀请老师
     */
    private String otherTeacherId;

    /**
     * 添加标签
     */
    private String addLabel;

    /**
     * 是否通过审核0：未通过，1通过
     */
    private Boolean isAuditing;
    private Boolean delete;
    private Date createDataTime;

    private String createUserId;

    private Date updateDataTime;

    private String updateUserId;
    private List<CurriculumCoursewareVo> coursewareVo;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCurriculumTemplateId() {
        return curriculumTemplateId;
    }

    public void setCurriculumTemplateId(Integer curriculumTemplateId) {
        this.curriculumTemplateId = curriculumTemplateId;
    }

    public String getCurriculumTemplateName() {
        return curriculumTemplateName;
    }

    public void setCurriculumTemplateName(String curriculumTemplateName) {
        this.curriculumTemplateName = curriculumTemplateName;
    }

    public String getCurriculumIntroduce() {
        return curriculumIntroduce;
    }

    public void setCurriculumIntroduce(String curriculumIntroduce) {
        this.curriculumIntroduce = curriculumIntroduce;
    }

    public Integer getCoverId() {
        return coverId;
    }

    public void setCoverId(Integer coverId) {
        this.coverId = coverId;
    }

    public Integer getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Integer lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getLecturerName() {
        return lecturerName;
    }

    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    public String getOtherTeacherId() {
        return otherTeacherId;
    }

    public void setOtherTeacherId(String otherTeacherId) {
        this.otherTeacherId = otherTeacherId;
    }

    public String getAddLabel() {
        return addLabel;
    }

    public void setAddLabel(String addLabel) {
        this.addLabel = addLabel;
    }

    public Boolean getAuditing() {
        return isAuditing;
    }

    public void setAuditing(Boolean auditing) {
        isAuditing = auditing;
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

    public List<CurriculumCoursewareVo> getCoursewareVo() {
        return coursewareVo;
    }

    public void setCoursewareVo(List<CurriculumCoursewareVo> coursewareVo) {
        this.coursewareVo = coursewareVo;
    }
}