package com.example.zhangzhic.zzc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "curriculum_template_product")
public class CurriculumTemplateProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程模板Id
     */
    @Column(name = "curriculum_template_id")
    private Integer curriculumTemplateId;

    /**
     * 上课安排//放弃使用
     */
    @Column(name = "class_plan_id")
    private Integer classPlanId;

    /**
     * 1 代表专题课程 2 代表直播课程 3代表精品课程 4代表作业指导
     */
    private Byte type;

    /**
     * 上课星期
     */
    @Column(name = "class_week")
    private String classWeek;

    /**
     * 上课时间
     */
    @Column(name = "class_time")
    private String classTime;

    /**
     * 教辅Id
     */
    @Column(name = "teacher_assistant_id")
    private String teacherAssistantId;

    /**
     * 课程级别
     */
    private Byte level;

    /**
     * 章节总数
     */
    @Column(name = "total_chapter")
    private Byte totalChapter;

    /**
     * 课程级别id
     */
    @Column(name = "curriculum_level_id")
    private Integer curriculumLevelId;

    /**
     * 购买剩余时间
     */
    @Column(name = "purchase_validity_data")
    private Date purchaseValidityData;

    /**
     * 1 代表试看，0代表不能试看
     */
    @Column(name = "enable_try_look")
    private Boolean enableTryLook;

    /**
     * 1月卡，2代表季卡，3年卡 
     */
    @Column(name = "service_cycle")
    private Integer serviceCycle;

    /**
     * 设备名称
     */
    @Column(name = "equipment_name")
    private String equipmentName;

    /**
     * 上课安排
     */
    @Column(name = "plan_class")
    private Object planClass;

    /**
     * 是否删除0代表未删除，1代表删除
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
     * 获取课程模板Id
     *
     * @return curriculum_template_id - 课程模板Id
     */
    public Integer getCurriculumTemplateId() {
        return curriculumTemplateId;
    }

    /**
     * 设置课程模板Id
     *
     * @param curriculumTemplateId 课程模板Id
     */
    public void setCurriculumTemplateId(Integer curriculumTemplateId) {
        this.curriculumTemplateId = curriculumTemplateId;
    }

    /**
     * 获取上课安排//放弃使用
     *
     * @return class_plan_id - 上课安排//放弃使用
     */
    public Integer getClassPlanId() {
        return classPlanId;
    }

    /**
     * 设置上课安排//放弃使用
     *
     * @param classPlanId 上课安排//放弃使用
     */
    public void setClassPlanId(Integer classPlanId) {
        this.classPlanId = classPlanId;
    }

    /**
     * 获取1 代表专题课程 2 代表直播课程 3代表精品课程 4代表作业指导
     *
     * @return type - 1 代表专题课程 2 代表直播课程 3代表精品课程 4代表作业指导
     */
    public Byte getType() {
        return type;
    }

    /**
     * 设置1 代表专题课程 2 代表直播课程 3代表精品课程 4代表作业指导
     *
     * @param type 1 代表专题课程 2 代表直播课程 3代表精品课程 4代表作业指导
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * 获取上课星期
     *
     * @return class_week - 上课星期
     */
    public String getClassWeek() {
        return classWeek;
    }

    /**
     * 设置上课星期
     *
     * @param classWeek 上课星期
     */
    public void setClassWeek(String classWeek) {
        this.classWeek = classWeek;
    }

    /**
     * 获取上课时间
     *
     * @return class_time - 上课时间
     */
    public String getClassTime() {
        return classTime;
    }

    /**
     * 设置上课时间
     *
     * @param classTime 上课时间
     */
    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    /**
     * 获取教辅Id
     *
     * @return teacher_assistant_id - 教辅Id
     */
    public String getTeacherAssistantId() {
        return teacherAssistantId;
    }

    /**
     * 设置教辅Id
     *
     * @param teacherAssistantId 教辅Id
     */
    public void setTeacherAssistantId(String teacherAssistantId) {
        this.teacherAssistantId = teacherAssistantId;
    }

    /**
     * 获取课程级别
     *
     * @return level - 课程级别
     */
    public Byte getLevel() {
        return level;
    }

    /**
     * 设置课程级别
     *
     * @param level 课程级别
     */
    public void setLevel(Byte level) {
        this.level = level;
    }

    /**
     * 获取章节总数
     *
     * @return total_chapter - 章节总数
     */
    public Byte getTotalChapter() {
        return totalChapter;
    }

    /**
     * 设置章节总数
     *
     * @param totalChapter 章节总数
     */
    public void setTotalChapter(Byte totalChapter) {
        this.totalChapter = totalChapter;
    }

    /**
     * 获取课程级别id
     *
     * @return curriculum_level_id - 课程级别id
     */
    public Integer getCurriculumLevelId() {
        return curriculumLevelId;
    }

    /**
     * 设置课程级别id
     *
     * @param curriculumLevelId 课程级别id
     */
    public void setCurriculumLevelId(Integer curriculumLevelId) {
        this.curriculumLevelId = curriculumLevelId;
    }

    /**
     * 获取购买剩余时间
     *
     * @return purchase_validity_data - 购买剩余时间
     */
    public Date getPurchaseValidityData() {
        return purchaseValidityData;
    }

    /**
     * 设置购买剩余时间
     *
     * @param purchaseValidityData 购买剩余时间
     */
    public void setPurchaseValidityData(Date purchaseValidityData) {
        this.purchaseValidityData = purchaseValidityData;
    }

    /**
     * 获取1 代表试看，0代表不能试看
     *
     * @return enable_try_look - 1 代表试看，0代表不能试看
     */
    public Boolean getEnableTryLook() {
        return enableTryLook;
    }

    /**
     * 设置1 代表试看，0代表不能试看
     *
     * @param enableTryLook 1 代表试看，0代表不能试看
     */
    public void setEnableTryLook(Boolean enableTryLook) {
        this.enableTryLook = enableTryLook;
    }

    /**
     * 获取1月卡，2代表季卡，3年卡 
     *
     * @return service_cycle - 1月卡，2代表季卡，3年卡 
     */
    public Integer getServiceCycle() {
        return serviceCycle;
    }

    /**
     * 设置1月卡，2代表季卡，3年卡 
     *
     * @param serviceCycle 1月卡，2代表季卡，3年卡 
     */
    public void setServiceCycle(Integer serviceCycle) {
        this.serviceCycle = serviceCycle;
    }

    /**
     * 获取设备名称
     *
     * @return equipment_name - 设备名称
     */
    public String getEquipmentName() {
        return equipmentName;
    }

    /**
     * 设置设备名称
     *
     * @param equipmentName 设备名称
     */
    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    /**
     * 获取上课安排
     *
     * @return plan_class - 上课安排
     */
    public Object getPlanClass() {
        return planClass;
    }

    /**
     * 设置上课安排
     *
     * @param planClass 上课安排
     */
    public void setPlanClass(Object planClass) {
        this.planClass = planClass;
    }

    /**
     * 获取是否删除0代表未删除，1代表删除
     *
     * @return is_delete - 是否删除0代表未删除，1代表删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除0代表未删除，1代表删除
     *
     * @param isDelete 是否删除0代表未删除，1代表删除
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