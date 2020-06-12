package com.example.zhangzhic.zzc.serviceImpl;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.mapper.CurriculumCoursewareMapper;
import com.example.zhangzhic.zzc.pojo.Courseware;
import com.example.zhangzhic.zzc.pojo.CurriculumCourseware;
import com.example.zhangzhic.zzc.service.CoursewareService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CoursewareServiceImpl implements CoursewareService {
    @Resource
    private CurriculumCoursewareMapper curriculumCoursewareMapper;
    @Override
    public Result<List<CurriculumCourseware>> getList(CurriculumCourseware curriculumCourseware) {
        curriculumCoursewareMapper.select(curriculumCourseware);
        return null;
    }

    @Override
    public  Result<Boolean> create(CurriculumCourseware courseware) {
        Result<Boolean> result =new Result<>();
        try {
           int  insert = curriculumCoursewareMapper.insertSelective(courseware);
            result.setData(insert==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public  Result<Boolean> uodate(CurriculumCourseware courseware) {
        Result<Boolean> result =new Result<>();

        try {
            int insert = curriculumCoursewareMapper.updateByPrimaryKeySelective(courseware);
            result.setData(insert==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public  Result<Boolean> delete(String id) {
        Result<Boolean> result =new Result<>();

        try {
            int insert = curriculumCoursewareMapper.deleteByPrimaryKey(id);
            result.setData(insert==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<CurriculumCourseware> getDetail(String id) {
        Result<CurriculumCourseware> result =new Result<CurriculumCourseware>();
        try {
            CurriculumCourseware courseware = curriculumCoursewareMapper.selectByPrimaryKey(id);
            result.setData(courseware);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

}
