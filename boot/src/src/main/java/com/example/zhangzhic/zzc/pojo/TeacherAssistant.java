package com.example.zhangzhic.zzc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "teacher_assistant")
public class TeacherAssistant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 教辅名称
     */
    @Column(name = "teacher_assistant_name")
    private String teacherAssistantName;

    /**
     * 归附出版社
     */
    @Column(name = " belonging_press")
    private String belongingPress;

    /**
     * 年级
     */
    private String grade;

    /**
     * 学期 1对应上学期，2对应下学期，3上下学期
     */
    private Integer semester;

    /**
     * 作者
     */
    private String author;

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
     * 获取教辅名称
     *
     * @return teacher_assistant_name - 教辅名称
     */
    public String getTeacherAssistantName() {
        return teacherAssistantName;
    }

    /**
     * 设置教辅名称
     *
     * @param teacherAssistantName 教辅名称
     */
    public void setTeacherAssistantName(String teacherAssistantName) {
        this.teacherAssistantName = teacherAssistantName;
    }

    /**
     * 获取归附出版社
     *
     * @return 
belonging_press - 归附出版社
     */
    public String getbelongingPress() {
        return belongingPress;
    }

    /**
     * 设置归附出版社
     *
     * @param 
belongingPress 归附出版社
     */
    public void setbelongingPress(String belongingPress) {
        this.belongingPress = belongingPress;
    }

    /**
     * 获取年级
     *
     * @return grade - 年级
     */
    public String getGrade() {
        return grade;
    }

    /**
     * 设置年级
     *
     * @param grade 年级
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取学期 1对应上学期，2对应下学期，3上下学期
     *
     * @return semester - 学期 1对应上学期，2对应下学期，3上下学期
     */
    public Integer getSemester() {
        return semester;
    }

    /**
     * 设置学期 1对应上学期，2对应下学期，3上下学期
     *
     * @param semester 学期 1对应上学期，2对应下学期，3上下学期
     */
    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
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