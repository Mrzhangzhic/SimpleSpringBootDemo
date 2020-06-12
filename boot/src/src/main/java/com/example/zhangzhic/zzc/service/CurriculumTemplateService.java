package com.example.zhangzhic.zzc.service;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.CurriculumTemplate;

import java.util.List;
import java.util.Map;

public interface CurriculumTemplateService {
    Result<List<CurriculumTemplate>> getList();
    Result<Boolean> create(CurriculumTemplate curriculumTemplate);
    Result<Boolean> uodate(CurriculumTemplate curriculumTemplate);
    Result<Boolean> delete(String id);
    Result<CurriculumTemplate>  getDetail(String id);
    Result<List<CurriculumTemplate>> getList(CurriculumTemplate map);
}
