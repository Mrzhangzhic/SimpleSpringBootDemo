package com.example.zhangzhic.zzc.Vo;

import com.example.zhangzhic.zzc.pojo.PlanClass;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import com.alibaba.fastjson.JSONObject;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
@ApiModel(value="CurriculumTemplateProductVo",description = "产品形式")
@Data
public class CurriculumTemplateProductVo  implements Serializable {
    @ApiModelProperty(value = "主键",name = "id",required = true)
    private Integer id;
    @ApiModelProperty(value = "主键",name = "curriculumTemplateId",required = true)
    private Integer curriculumTemplateId;
    private Integer classPlanId;
    private Integer type;
    private String classWeek;
    private String classTime;
    private String teacherAssistant;
    private Integer level;
    private Integer totalChapter;
    private Integer curriculumLevelId;
    private Date purchaseValidityData;
    private boolean enableTryLook;
    private Integer serviceCycle;
    private String equipmentName;
    private Date createDataTime;

    private Integer createUserId;

    private Date updateDataTime;

    private Integer updateUserId;
    private JSONObject planclass;

    private static final long serialVersionUID = 1L;
}
