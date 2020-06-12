package com.example.zhangzhic.zzc.pojo;

import lombok.Data;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
@Data
public class Curriculum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 课程模板Id
     */
    @Column(name = "curriculum_template_id")
    private Integer curriculumTemplateId;

    /**
     * 课程模板名
     */
    @Column(name = "curriculum_template_name")
    private String curriculumTemplateName;

    /**
     * 主讲老师Id
     */
    @Column(name = "Lecturer_Id")
    private Integer lecturerId;

    /**
     * 主讲老师
     */
    @Column(name = "Lecturer_name")
    private String lecturerName;

    /**
     * 封面Id
     */
    @Column(name = "cover_id")
    private Integer coverId;

    /**
     * 邀请老师
     */
    @Column(name = "other_teacher_id")
    private String otherTeacherId;

    /**
     * 标签
     */
    @Column(name = "add_label")
    private String addLabel;

    /**
     * 是否通过审核0：未通过，1通过 
     */
    @Column(name = "is_auditing")
    private Boolean isAuditing;

    /**
     * 课程文件
     */
    @Column(name = "file_id")
    private Integer fileId;

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
     * 课程介绍
     */
    @Column(name = "curriculum_introduce")
    private String curriculumIntroduce;
    private List<CurriculumCourseware> curriculumCourseware;

}