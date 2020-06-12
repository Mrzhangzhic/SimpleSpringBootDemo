package com.example.zhangzhic.zzc.Vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * curriculum_level
 * @author 
 */
@Data
public class CurriculumLevelVo implements Serializable {

    private Integer id;

    private Integer curriculumTemplateProductId;

    /**
     * 父Id
     */
    private Integer parentId;

    /**
     * 总章节
     */
    private Integer totalChapter;

    /**
     * 章节级别
     */
    private Integer chapterLevel;

    /**
     * 深度
     */
    private Byte level;

    /**
     * 章标题
     */
    private String chapter;

    /**
     * 节标题
     */
    private String section;

    /**
     * 小节标题
     */
    private String small;

    /**
     * 知识点Id
     */
    private Integer knowledgePointsId;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    private Date createDataTime;

    private Integer createUserId;

    private Date updateDataTime;

    private Integer updateUserId;

    private static final long serialVersionUID = 1L;


}