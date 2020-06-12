package generate;

import java.io.Serializable;
import java.util.Date;


/**
 * curriculum_template
 * @author 
 */

public class CurriculumTemplate implements Serializable {
    /**
     * 课程id
     */
    private String id;

    /**
     * 课程模板名称
     */
    private String templateName;

    /**
     * 科目Id
     */
    private String subjectId;

    /**
     * 教师id
     */
    private String teacherId;

    /**
     * 1-5 代表难度
     */
    private Integer difficulty;

    /**
     * 1 代表上学期 2代表下学期 3代表上下两学期
     */
    private Integer semester;

    /**
     * 1 代表3人以内 2 代表五人以内 3 代表10人以内
     */
    private Integer teacherNumbers;

    /**
     * 适用年级
     */
    private String applyGrade;

    /**
     * 封面id
     */
    private String coverId;

    /**
     * 最少学生数量
     */
    private Integer minStudentNumbers;

    /**
     * 最多学生数量
     */
    private Integer maxStudentNumbers;

    /**
     * 产品形式Id
     */
    private String productFormId;

    /**
     * 课程上课日期
     */
    private Date classStartDate;

    /**
     * 模板使用次数
     */
    private Integer templatePlantNumbers;

    /**
     * 总课时数（节数）
     */
    private Integer totalClass;

    /**
     * 课程有效时长
     */
    private Integer totalClassHours;

    /**
     * 是否停止
     */
    private Boolean isStop;

    /**
     * 是否删除
     */
    private Boolean isDelete;

    /**
     * 创建时间
     */
    private Date createDataTime;

    /**
     * 创建人_id
     */
    private String createUserId;

    /**
     * 更新时间
     */
    private Date updateDataTime;

    /**
     * 更新人_id
     */
    private String updateUserId;

    private static final long serialVersionUID = 1L;
}