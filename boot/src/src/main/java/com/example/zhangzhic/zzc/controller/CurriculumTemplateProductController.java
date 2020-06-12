package com.example.zhangzhic.zzc.controller;

import com.alibaba.fastjson.JSON;
import com.example.zhangzhic.zzc.Vo.CurriculumLevelVo;
import com.example.zhangzhic.zzc.Vo.CurriculumTemplateProductVo;
import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.*;
import com.example.zhangzhic.zzc.service.CurriculumTemplateProductService;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
/*模板中的产品形式*/
@RestController
@RequestMapping("/curriculumtemplateproduct")
@Api(value = "这是产品数据的API",tags = "产品数据接口（xjy）")
public class CurriculumTemplateProductController {

    @Resource
    private CurriculumTemplateProductService curriculumTemplateProductService;
    @RequestMapping(value = "/show/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<CurriculumTemplateProduct> getDetail(@PathVariable("id") String id){
        return  curriculumTemplateProductService.getDetail(id);
    }
    @RequestMapping(value = "/update.json", method = RequestMethod.POST)
    @ResponseBody
    public Result<Boolean> update(@RequestBody  CurriculumTemplateProduct curriculumTemplateProduct){
        return  curriculumTemplateProductService.uodate(curriculumTemplateProduct);
    }
    @ApiOperation(value = "产品形式的添加")
    @ApiParam(name = "CurriculumTemplateProductVo",value = "实体类",required = true)
    @RequestMapping(value = "/insert.json", method = RequestMethod.POST)
    public Result<Integer> insert(@RequestBody CurriculumTemplateProductVo curriculumTemplateProductVo
    ){
        CurriculumTemplateProduct curriculumTemplateProduct =new CurriculumTemplateProduct();
        BeanUtils.copyProperties(curriculumTemplateProductVo,curriculumTemplateProduct);
        JSON planclass =curriculumTemplateProductVo.getPlanclass();
        curriculumTemplateProduct.setPlanClass(planclass);

        return  curriculumTemplateProductService.create(curriculumTemplateProduct);
    }
    @RequestMapping(value = "/delete/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<Boolean> delet(@PathVariable("id") String id){
        return  curriculumTemplateProductService.delete(id);
    }

}
