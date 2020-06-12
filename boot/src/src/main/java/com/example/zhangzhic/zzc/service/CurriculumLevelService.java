package com.example.zhangzhic.zzc.service;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.Courseware;
import com.example.zhangzhic.zzc.pojo.CurriculumLevel;

import java.util.List;

public interface CurriculumLevelService {
    Result<List<CurriculumLevel>> getList();
    Result<Boolean> create(CurriculumLevel courseware);
    Result<Boolean> uodate(CurriculumLevel courseware);
    Result<Boolean> delete(Integer id);
    Result<CurriculumLevel> getDetail(Integer id);
}
