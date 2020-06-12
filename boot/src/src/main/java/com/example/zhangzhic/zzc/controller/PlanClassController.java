package com.example.zhangzhic.zzc.controller;


import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.PlanClass;
import com.example.zhangzhic.zzc.service.PlanClassService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
@Deprecated
@Controller
@RequestMapping(value = "/planclass")
public class PlanClassController {
    @Resource
    private PlanClassService planClassService;
    @RequestMapping(value = "/show/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<PlanClass> getDetail(@PathVariable("id") String id){
        return  planClassService.getDetail(id);
    }
    @RequestMapping(value = "/update.json", method = RequestMethod.POST)
    @ResponseBody
    public Result<Boolean> update(@RequestBody PlanClass planClass){
        return  planClassService.uodate(planClass);
    }
    @RequestMapping(value = "/insert.json", method = RequestMethod.POST)
    @ResponseBody
    public Result<Boolean> insert(@RequestBody PlanClass planClass){
        return  planClassService.create(planClass);
    }
    @RequestMapping(value = "/delete/{id}.json", method = RequestMethod.GET)
    @ResponseBody
    public Result<Boolean> delet(@PathVariable("id") String id){
        return  planClassService.delete(id);
    }
}
