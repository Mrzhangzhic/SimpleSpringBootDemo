package com.example.zhangzhic.zzc.controller;

import com.example.zhangzhic.zzc.Vo.CurriculumCoursewareVo;
import com.example.zhangzhic.zzc.Vo.CurriculumVo;
import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.Courseware;
import com.example.zhangzhic.zzc.pojo.Curriculum;
import com.example.zhangzhic.zzc.pojo.CurriculumCourseware;
import com.example.zhangzhic.zzc.service.CurriculumService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
* 课程*/
@Api(value = "课程表的API文档（zzc）" ,tags = "课程api（zzc）")
@RestController
@RequestMapping(value = "/curriculum")
public class CurriculumController {
    @Resource
    private CurriculumService curriculumService;
    @RequestMapping(value = "/show/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<Curriculum> getDetail(@PathVariable("id") String id){
        return  curriculumService.getDetail(id);
    }
    @RequestMapping(value = "/update.json", method = RequestMethod.POST)
    @ResponseBody
    public Result<Boolean> update(@RequestBody Curriculum curriculum ){
        return  curriculumService.update(curriculum);
    }
    @ApiOperation(value = "课程表的新建")
    @RequestMapping(value = "/insert.json", method = RequestMethod.POST)
    @ApiParam(name = "CurriculumVo",value = "Vo类",required = true)
    @ResponseBody
    public Result<Boolean> insert(@RequestBody CurriculumVo curriculumVo){
        Curriculum curriculum =new Curriculum();
        BeanUtils.copyProperties(curriculumVo,curriculum);

        List<CurriculumCoursewareVo> vos =curriculumVo.getCoursewareVo();
        List<CurriculumCourseware> list =new ArrayList<>();
        for (CurriculumCoursewareVo o: vos) {
            CurriculumCourseware courseware =new CurriculumCourseware();
            BeanUtils.copyProperties(o,courseware);
            list.add(courseware);
        }
        curriculum.setIsDelete(curriculumVo.getDelete());
        curriculum.setCurriculumCourseware(list);
        return  curriculumService.create(curriculum);
    }
    @RequestMapping(value = "/delete/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<Boolean> delet(@PathVariable("id") String id){
        return  curriculumService.delete(id);
    }

    @RequestMapping(value = "/get/list.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<List<Curriculum>> delet(Curriculum map)
    {
        return  curriculumService.getList(map);
    }
}
