package com.example.zhangzhic.zzc.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
@Data
@Table(name = "curriculum_template")
public class CurriculumTemplate {
    /**
     * 课程id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程模板名称
     */
    @Column(name = "template_name")
    private String templateName;

    /**
     * 科目
     */
    private Integer subject;

    /**
     * 教师id
     */
    @Column(name = "teacher_id")
    private Integer teacherId;

    /**
     * 1-5 代表难度
     */
    private Byte difficulty;

    /**
     * 1 代表上学期 2代表下学期 3代表上下两学期
     */
    private Byte semester;

    /**
     * 1 代表3人以内 2 代表五人以内 3 代表10人以内 
     */
    @Column(name = "teacher_numbers")
    private Boolean teacherNumbers;

    /**
     * 适用年级
     */
    @Column(name = "apply_grade")
    private String applyGrade;

    /**
     * 封面id
     */
    @Column(name = "cover_id")
    private Integer coverId;

    /**
     * 最少学生数量
     */
    @Column(name = "min_student_numbers")
    private Integer minStudentNumbers;

    /**
     * 最多学生数量
     */
    @Column(name = "max_student_numbers")
    private Integer maxStudentNumbers;

    /**
     * 产品形式Id//舍弃
     */
    @Column(name = "product_form_id")
    private Integer productFormId;

    /**
     * 课程上课日期
     */
    @Column(name = "class_start_date")
    private Date classStartDate;

    /**
     * 模板使用次数
     */
    @Column(name = "template_plant_numbers")
    private Integer templatePlantNumbers;

    /**
     * 总课时数（节数）
     */
    @Column(name = "total_class")
    private Integer totalClass;

    /**
     * 课程有效时长
     */
    @Column(name = "total_class_hours")
    private Integer totalClassHours;

    /**
     * 是否停止
     */
    @Column(name = "is_stop")
    private Boolean isStop;

    /**
     * 是否删除 默认为0：1代表删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    /**
     * 创建时间
     */
    @Column(name = "create_data_time")
    private Date createDataTime;

    /**
     * 创建人_id
     */
    @Column(name = "create_user_id")
    private Integer createUserId;

    /**
     * 更新时间
     */
    @Column(name = "update_data_time")
    private Date updateDataTime;

    /**
     * 更新人_id
     */
    @Column(name = "update_user_id")
    private Integer updateUserId;

    /**
     * 获取课程id
     *
     * @return id - 课程id
     */
    public Integer getId() {
        return id;
    }
    private CurriculumTemplateProduct curriculumTemplateProduct;
    private Courseware courseware;
    private List<CurriculumLevel> curriculumLevel;
    /**
     * 设置课程id
     *
     * @param id 课程id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取课程模板名称
     *
     * @return template_name - 课程模板名称
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * 设置课程模板名称
     *
     * @param templateName 课程模板名称
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * 获取科目
     *
     * @return subject - 科目
     */
    public Integer getSubject() {
        return subject;
    }

    /**
     * 设置科目
     *
     * @param subject 科目
     */
    public void setSubject(Integer subject) {
        this.subject = subject;
    }

    /**
     * 获取教师id
     *
     * @return teacher_id - 教师id
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * 设置教师id
     *
     * @param teacherId 教师id
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 获取1-5 代表难度
     *
     * @return difficulty - 1-5 代表难度
     */
    public Byte getDifficulty() {
        return difficulty;
    }

    /**
     * 设置1-5 代表难度
     *
     * @param difficulty 1-5 代表难度
     */
    public void setDifficulty(Byte difficulty) {
        this.difficulty = difficulty;
    }

    /**
     * 获取1 代表上学期 2代表下学期 3代表上下两学期
     *
     * @return semester - 1 代表上学期 2代表下学期 3代表上下两学期
     */
    public Byte getSemester() {
        return semester;
    }

    /**
     * 设置1 代表上学期 2代表下学期 3代表上下两学期
     *
     * @param semester 1 代表上学期 2代表下学期 3代表上下两学期
     */
    public void setSemester(Byte semester) {
        this.semester = semester;
    }

    /**
     * 获取1 代表3人以内 2 代表五人以内 3 代表10人以内 
     *
     * @return teacher_numbers - 1 代表3人以内 2 代表五人以内 3 代表10人以内 
     */
    public Boolean getTeacherNumbers() {
        return teacherNumbers;
    }

    /**
     * 设置1 代表3人以内 2 代表五人以内 3 代表10人以内 
     *
     * @param teacherNumbers 1 代表3人以内 2 代表五人以内 3 代表10人以内 
     */
    public void setTeacherNumbers(Boolean teacherNumbers) {
        this.teacherNumbers = teacherNumbers;
    }

    /**
     * 获取适用年级
     *
     * @return apply_grade - 适用年级
     */
    public String getApplyGrade() {
        return applyGrade;
    }

    /**
     * 设置适用年级
     *
     * @param applyGrade 适用年级
     */
    public void setApplyGrade(String applyGrade) {
        this.applyGrade = applyGrade;
    }

    /**
     * 获取封面id
     *
     * @return cover_id - 封面id
     */
    public Integer getCoverId() {
        return coverId;
    }

    /**
     * 设置封面id
     *
     * @param coverId 封面id
     */
    public void setCoverId(Integer coverId) {
        this.coverId = coverId;
    }

    /**
     * 获取最少学生数量
     *
     * @return min_student_numbers - 最少学生数量
     */
    public Integer getMinStudentNumbers() {
        return minStudentNumbers;
    }

    /**
     * 设置最少学生数量
     *
     * @param minStudentNumbers 最少学生数量
     */
    public void setMinStudentNumbers(Integer minStudentNumbers) {
        this.minStudentNumbers = minStudentNumbers;
    }

    /**
     * 获取最多学生数量
     *
     * @return max_student_numbers - 最多学生数量
     */
    public Integer getMaxStudentNumbers() {
        return maxStudentNumbers;
    }

    /**
     * 设置最多学生数量
     *
     * @param maxStudentNumbers 最多学生数量
     */
    public void setMaxStudentNumbers(Integer maxStudentNumbers) {
        this.maxStudentNumbers = maxStudentNumbers;
    }

    /**
     * 获取产品形式Id//舍弃
     *
     * @return product_form_id - 产品形式Id//舍弃
     */
    public Integer getProductFormId() {
        return productFormId;
    }

    /**
     * 设置产品形式Id//舍弃
     *
     * @param productFormId 产品形式Id//舍弃
     */
    public void setProductFormId(Integer productFormId) {
        this.productFormId = productFormId;
    }

    /**
     * 获取课程上课日期
     *
     * @return class_start_date - 课程上课日期
     */
    public Date getClassStartDate() {
        return classStartDate;
    }

    /**
     * 设置课程上课日期
     *
     * @param classStartDate 课程上课日期
     */
    public void setClassStartDate(Date classStartDate) {
        this.classStartDate = classStartDate;
    }

    /**
     * 获取模板使用次数
     *
     * @return template_plant_numbers - 模板使用次数
     */
    public Integer getTemplatePlantNumbers() {
        return templatePlantNumbers;
    }

    /**
     * 设置模板使用次数
     *
     * @param templatePlantNumbers 模板使用次数
     */
    public void setTemplatePlantNumbers(Integer templatePlantNumbers) {
        this.templatePlantNumbers = templatePlantNumbers;
    }

    /**
     * 获取总课时数（节数）
     *
     * @return total_class - 总课时数（节数）
     */
    public Integer getTotalClass() {
        return totalClass;
    }

    /**
     * 设置总课时数（节数）
     *
     * @param totalClass 总课时数（节数）
     */
    public void setTotalClass(Integer totalClass) {
        this.totalClass = totalClass;
    }

    /**
     * 获取课程有效时长
     *
     * @return total_class_hours - 课程有效时长
     */
    public Integer getTotalClassHours() {
        return totalClassHours;
    }

    /**
     * 设置课程有效时长
     *
     * @param totalClassHours 课程有效时长
     */
    public void setTotalClassHours(Integer totalClassHours) {
        this.totalClassHours = totalClassHours;
    }

    /**
     * 获取是否停止
     *
     * @return is_stop - 是否停止
     */
    public Boolean getIsStop() {
        return isStop;
    }

    /**
     * 设置是否停止
     *
     * @param isStop 是否停止
     */
    public void setIsStop(Boolean isStop) {
        this.isStop = isStop;
    }

    /**
     * 获取是否删除 默认为0：1代表删除
     *
     * @return is_delete - 是否删除 默认为0：1代表删除
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 默认为0：1代表删除
     *
     * @param isDelete 是否删除 默认为0：1代表删除
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取创建时间
     *
     * @return create_data_time - 创建时间
     */
    public Date getCreateDataTime() {
        return createDataTime;
    }

    /**
     * 设置创建时间
     *
     * @param createDataTime 创建时间
     */
    public void setCreateDataTime(Date createDataTime) {
        this.createDataTime = createDataTime;
    }

    /**
     * 获取创建人_id
     *
     * @return create_user_id - 创建人_id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建人_id
     *
     * @param createUserId 创建人_id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取更新时间
     *
     * @return update_data_time - 更新时间
     */
    public Date getUpdateDataTime() {
        return updateDataTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateDataTime 更新时间
     */
    public void setUpdateDataTime(Date updateDataTime) {
        this.updateDataTime = updateDataTime;
    }

    /**
     * 获取更新人_id
     *
     * @return update_user_id - 更新人_id
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置更新人_id
     *
     * @param updateUserId 更新人_id
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }
}