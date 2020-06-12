package com.example.zhangzhic.zzc.service;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.Courseware;
import com.example.zhangzhic.zzc.pojo.CurriculumCourseware;

import java.util.List;

public interface CoursewareService {
    Result<List<CurriculumCourseware>> getList(CurriculumCourseware curriculumCourseware);
    Result<Boolean> create(CurriculumCourseware courseware);
    Result<Boolean> uodate(CurriculumCourseware courseware);
    Result<Boolean> delete(String id);
    Result<CurriculumCourseware> getDetail(String id);
}
