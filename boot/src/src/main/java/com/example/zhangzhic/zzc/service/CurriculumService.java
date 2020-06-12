package com.example.zhangzhic.zzc.service;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.Curriculum;

import java.util.List;
import java.util.Map;

public interface CurriculumService {
    /**
     *   列表展示资源
     *  @Param map    参数集合
     **/
    Result<List<Curriculum>> getList(Curriculum map);
    Result<Boolean> create(Curriculum curriculum);
    Result<Boolean> update(Curriculum curriculum);

    Result<Boolean> delete(String id);
    Result<Curriculum>  getDetail(String id);
}
