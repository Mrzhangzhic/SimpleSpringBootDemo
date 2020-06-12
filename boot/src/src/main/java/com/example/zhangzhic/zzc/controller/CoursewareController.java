package com.example.zhangzhic.zzc.controller;

import com.example.zhangzhic.zzc.Vo.CurriculumCoursewareVo;
import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.Courseware;
import com.example.zhangzhic.zzc.pojo.CurriculumCourseware;
import com.example.zhangzhic.zzc.service.CoursewareService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.beans.beancontext.BeanContext;

@RestController
@RequestMapping(value = "/courseware")
@Api(value = "课件API",tags = "课件api（zzc）")
/*课件*/
public class CoursewareController {
    @Resource
    private CoursewareService coursewareService;
    @RequestMapping(value = "/show/{id}.json", method = RequestMethod.GET)


    public Result<CurriculumCourseware> getDetail(@PathVariable("id") String id){
        return  coursewareService.getDetail(id);
    }
    @RequestMapping(value = "/update.json", method = RequestMethod.POST)
    @ApiParam(name = "courseware",value = "Vo类",required = true)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "functionId",value = "资源id",required = false),
            @ApiImplicitParam(name = "parentId",value = "缺陷id",required = false)
    })

    public Result<Boolean> update(@RequestBody CurriculumCoursewareVo courseware){
        CurriculumCourseware curriculumCourseware =new CurriculumCourseware();
        BeanUtils.copyProperties(courseware,curriculumCourseware);
        return  coursewareService.uodate(curriculumCourseware);
    }
    @RequestMapping(value = "/insert.json", method = RequestMethod.POST)

    public Result<Boolean> insert(@RequestBody CurriculumCourseware courseware){
        return  coursewareService.create(courseware);
    }
    @RequestMapping(value = "/delete/{id}.json", method = RequestMethod.GET)
    public Result<Boolean> delet(@PathVariable("id") String id){
        return  coursewareService.delete(id);
    }


}
