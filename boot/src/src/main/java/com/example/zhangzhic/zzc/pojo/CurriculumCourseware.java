package com.example.zhangzhic.zzc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "curriculum_courseware")
public class CurriculumCourseware {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程id
     */
    @Column(name = "curriculum_id")
    private Integer curriculumId;

    /**
     * 总深度
     */
    @Column(name = "total_level")
    private Byte totalLevel;

    /**
     * 深度
     */
    private Byte level;

    /**
     * 章标题
     */
    @Column(name = "video_url")
    private String videoUrl;

    /**
     * 节标题
     */
    @Column(name = "file_url")
    private String fileUrl;

    /**
     * 是否通过审核0：未通过，1通过
     */
    @Column(name = "is_auditing")
    private Boolean isAuditing;

    /**
     * 主讲老师
     */
    @Column(name = "mian_tacher")
    private String mianTacher;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    @Column(name = "create_data_time")
    private Date createDataTime;

    @Column(name = "create_user_id")
    private Integer createUserId;

    @Column(name = "update_data_time")
    private Date updateDataTime;

    @Column(name = "update_user_id")
    private Integer updateUserId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取课程id
     *
     * @return curriculum_id - 课程id
     */
    public Integer getCurriculumId() {
        return curriculumId;
    }

    /**
     * 设置课程id
     *
     * @param curriculumId 课程id
     */
    public void setCurriculumId(Integer curriculumId) {
        this.curriculumId = curriculumId;
    }

    /**
     * 获取总深度
     *
     * @return total_level - 总深度
     */
    public Byte getTotalLevel() {
        return totalLevel;
    }

    /**
     * 设置总深度
     *
     * @param totalLevel 总深度
     */
    public void setTotalLevel(Byte totalLevel) {
        this.totalLevel = totalLevel;
    }

    /**
     * 获取深度
     *
     * @return level - 深度
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * 设置深度
     *
     * @param level 深度
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * 获取章标题
     *
     * @return video_url - 章标题
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    /**
     * 设置章标题
     *
     * @param videoUrl 章标题
     */
    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    /**
     * 获取节标题
     *
     * @return file_url - 节标题
     */
    public String getFileUrl() {
        return fileUrl;
    }

    /**
     * 设置节标题
     *
     * @param fileUrl 节标题
     */
    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    /**
     * 获取是否通过审核0：未通过，1通过
     *
     * @return is_auditing - 是否通过审核0：未通过，1通过
     */
    public Boolean getIsAuditing() {
        return isAuditing;
    }

    /**
     * 设置是否通过审核0：未通过，1通过
     *
     * @param isAuditing 是否通过审核0：未通过，1通过
     */
    public void setIsAuditing(Boolean isAuditing) {
        this.isAuditing = isAuditing;
    }

    /**
     * 获取主讲老师
     *
     * @return mian_tacher - 主讲老师
     */
    public String getMianTacher() {
        return mianTacher;
    }

    /**
     * 设置主讲老师
     *
     * @param mianTacher 主讲老师
     */
    public void setMianTacher(String mianTacher) {
        this.mianTacher = mianTacher;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return create_data_time
     */
    public Date getCreateDataTime() {
        return createDataTime;
    }

    /**
     * @param createDataTime
     */
    public void setCreateDataTime(Date createDataTime) {
        this.createDataTime = createDataTime;
    }

    /**
     * @return create_user_id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * @param createUserId
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * @return update_data_time
     */
    public Date getUpdateDataTime() {
        return updateDataTime;
    }

    /**
     * @param updateDataTime
     */
    public void setUpdateDataTime(Date updateDataTime) {
        this.updateDataTime = updateDataTime;
    }

    /**
     * @return update_user_id
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * @param updateUserId
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
}