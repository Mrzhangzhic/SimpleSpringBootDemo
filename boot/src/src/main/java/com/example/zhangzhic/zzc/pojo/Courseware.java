package com.example.zhangzhic.zzc.pojo;

import lombok.Data;
import org.omg.PortableInterceptor.INACTIVE;

import java.io.Serializable;
import java.util.Date;

/**
 * courseware
 * @author 
 */
@Deprecated
@Data
public class Courseware implements Serializable {
    private Integer id;

    /**
     * 课程id
     */
    private Integer curriculumId;
    private Integer totalLevel;
    private Integer level;


    /**
     * 视频文件
     */
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


}