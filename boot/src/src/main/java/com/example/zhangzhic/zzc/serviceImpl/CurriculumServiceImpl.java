package com.example.zhangzhic.zzc.serviceImpl;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.mapper.CurriculumMapper;
import com.example.zhangzhic.zzc.pojo.Courseware;
import com.example.zhangzhic.zzc.pojo.Curriculum;
import com.example.zhangzhic.zzc.pojo.CurriculumCourseware;
import com.example.zhangzhic.zzc.service.CoursewareService;
import com.example.zhangzhic.zzc.service.CurriculumService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CurriculumServiceImpl implements CurriculumService {
    @Resource
    private CurriculumMapper curriculumMapper;

    @Resource
    private CoursewareService coursewareService;
    //课程列表
    @Override
    public Result<List<Curriculum>> getList(Curriculum map) {
        Result<List<Curriculum>> result =new Result<>();
        List<Curriculum> list = curriculumMapper.selectByExample(map);
        result.setData(list);
        result.setMessage("查询列表成功");
        result.setSuccess(true);
        return result;
    }
    //新建课程
    @Override
    public Result<Boolean> create(Curriculum curriculum) {
        Result<Boolean> result =new  Result<Boolean>();
        List<Courseware> courseware =new ArrayList<>();
        try {
            //新建课程
            curriculum.setCreateDataTime(new Date());
            curriculum.setUpdateDataTime(new Date());
            int insert = curriculumMapper.insert(curriculum);
            //新建课件
            List<CurriculumCourseware> list =curriculum.getCurriculumCourseware();
            for (CurriculumCourseware courseware1:list) {
                courseware1.setCurriculumId(curriculum.getId());
                courseware1.setUpdateDataTime(new Date());
                courseware1.setCreateDataTime(new Date());
                Result<Boolean> result1 = coursewareService.create(courseware1);
            }
            result.setData(insert==1);
            result.setMessage("增加成功");
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }
    //课程的更新
    @Override
    public Result<Boolean> update(Curriculum curriculum) {
        Result<Boolean> result =new  Result<Boolean>();
        try {
            int insert = curriculumMapper.updateByPrimaryKeySelective(curriculum);
            result.setData(insert==1);
            result.setMessage("更新成功");
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }
    //课程的逻辑删除
    @Override
    public Result<Boolean> delete(String id) {
        Result<Boolean> result =new  Result<Boolean>();
        try {
            int insert = curriculumMapper.deleteByPrimaryKey(id);
            result.setMessage("删除成功");
            result.setSuccess(true);
            result.setData(insert==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }
    //课程的详情
    @Override
    public Result<Curriculum> getDetail(String id) {
        Result<Curriculum> result =new  Result<Curriculum>();
        try {
            Curriculum curriculum = curriculumMapper.selectByPrimaryKey(id);
            result.setMessage("查询详情成功");
            result.setSuccess(true);
            result.setData(curriculum);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

}
