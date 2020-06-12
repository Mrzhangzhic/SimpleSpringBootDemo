package com.example.zhangzhic.zzc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "curriculum_level")
public class CurriculumLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "curriculum_template_product_id")
    private Integer curriculumTemplateProductId;

    /**
     * 父Id
     */
    @Column(name = "parent_id")
    private Integer parentId;

    /**
     * 总章节
     */
    @Column(name = "total_chapter")
    private Integer totalChapter;

    /**
     * 章节级别
     */
    @Column(name = "chapter_level")
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
    @Column(name = "knowledge_points_id")
    private Integer knowledgePointsId;

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
     * @return curriculum_template_product_id
     */
    public Integer getCurriculumTemplateProductId() {
        return curriculumTemplateProductId;
    }

    /**
     * @param curriculumTemplateProductId
     */
    public void setCurriculumTemplateProductId(Integer curriculumTemplateProductId) {
        this.curriculumTemplateProductId = curriculumTemplateProductId;
    }

    /**
     * 获取父Id
     *
     * @return parent_id - 父Id
     */
    public Integer getParentId() {
        return parentId;
    }

    /**
     * 设置父Id
     *
     * @param parentId 父Id
     */
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取总章节
     *
     * @return total_chapter - 总章节
     */
    public Integer getTotalChapter() {
        return totalChapter;
    }

    /**
     * 设置总章节
     *
     * @param totalChapter 总章节
     */
    public void setTotalChapter(Integer totalChapter) {
        this.totalChapter = totalChapter;
    }

    /**
     * 获取章节级别
     *
     * @return chapter_level - 章节级别
     */
    public Integer getChapterLevel() {
        return chapterLevel;
    }

    /**
     * 设置章节级别
     *
     * @param chapterLevel 章节级别
     */
    public void setChapterLevel(Integer chapterLevel) {
        this.chapterLevel = chapterLevel;
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
     * @return chapter - 章标题
     */
    public String getChapter() {
        return chapter;
    }

    /**
     * 设置章标题
     *
     * @param chapter 章标题
     */
    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    /**
     * 获取节标题
     *
     * @return section - 节标题
     */
    public String getSection() {
        return section;
    }

    /**
     * 设置节标题
     *
     * @param section 节标题
     */
    public void setSection(String section) {
        this.section = section;
    }

    /**
     * 获取小节标题
     *
     * @return small - 小节标题
     */
    public String getSmall() {
        return small;
    }

    /**
     * 设置小节标题
     *
     * @param small 小节标题
     */
    public void setSmall(String small) {
        this.small = small;
    }

    /**
     * 获取知识点Id
     *
     * @return knowledge_points_id - 知识点Id
     */
    public Integer getKnowledgePointsId() {
        return knowledgePointsId;
    }

    /**
     * 设置知识点Id
     *
     * @param knowledgePointsId 知识点Id
     */
    public void setKnowledgePointsId(Integer knowledgePointsId) {
        this.knowledgePointsId = knowledgePointsId;
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