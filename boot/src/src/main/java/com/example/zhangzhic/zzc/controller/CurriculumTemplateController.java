package com.example.zhangzhic.zzc.controller;

import com.example.zhangzhic.zzc.Vo.CurriculumLevelVo;
import com.example.zhangzhic.zzc.Vo.CurriculumTemplateProductVo;
import com.example.zhangzhic.zzc.Vo.CurriculumTemplateVo;
import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.*;
import com.example.zhangzhic.zzc.service.CoursewareService;
import com.example.zhangzhic.zzc.service.CurriculumTemplateService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/*
* 课程模板
* */
@Api(value = "课程模板的API文档（zzc）")
@RestController
@RequestMapping(value = "/curriculumtemplate")
public class CurriculumTemplateController {
    @Resource
    private CurriculumTemplateService curriculumTemplateService;
    @RequestMapping(value = "/show/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<CurriculumTemplate> getDetail(@PathVariable("id") String id){
        return  curriculumTemplateService.getDetail(id);
    }
    @RequestMapping(value = "/update.json", method = RequestMethod.POST)
    @ResponseBody
    public Result<Boolean> update(@RequestBody CurriculumTemplateVo curriculumTemplateVo){
        CurriculumTemplate curriculumTemplate =new CurriculumTemplate();
        BeanUtils.copyProperties(curriculumTemplateVo,curriculumTemplate);
        return  curriculumTemplateService.uodate(curriculumTemplate);
    }
    @RequestMapping(value = "/insert.json", method = RequestMethod.POST)
    @ResponseBody
    public Result<Boolean> insert(@RequestBody CurriculumTemplateVo curriculumTemplateVo){
        CurriculumTemplate curriculumTemplate =new CurriculumTemplate();
        BeanUtils.copyProperties(curriculumTemplateVo,curriculumTemplate);
        if (curriculumTemplateVo.getCurriculumTemplateProduct()!=null){
            CurriculumTemplateProductVo curriculumTemplateProductVo =curriculumTemplateVo.getCurriculumTemplateProduct();
            CurriculumTemplateProduct curriculumTemplateProduct =new CurriculumTemplateProduct();
            BeanUtils.copyProperties(curriculumTemplateProductVo,curriculumTemplateProduct);
            curriculumTemplate.setCurriculumTemplateProduct(curriculumTemplateProduct);
        }

        List<CurriculumLevelVo> curriculumLevelVo=curriculumTemplateVo.getCurriculumLevel();
        List<CurriculumLevel> levels=new ArrayList<>();

        for (CurriculumLevelVo vos:curriculumLevelVo) {
            CurriculumLevel curriculumLevel =new CurriculumLevel();
            BeanUtils.copyProperties(vos,curriculumLevel);
            levels.add(curriculumLevel);
            curriculumTemplate.setCurriculumLevel(levels);

        }
        PlanClassTwo planClass = curriculumTemplateVo.getPlanClass();
        return  curriculumTemplateService.create(curriculumTemplate);
    }

    @RequestMapping(value = "/delete/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<Boolean> delet(@PathVariable("id") String id){
        return  curriculumTemplateService.delete(id);
    }

    @RequestMapping(value = "/show/list.json", method = RequestMethod.POST)
    @ResponseBody
    public Result<List<CurriculumTemplate>> getList(@RequestBody CurriculumTemplate CurriculumTemplate){
        return  curriculumTemplateService.getList(CurriculumTemplate);
    }
}
