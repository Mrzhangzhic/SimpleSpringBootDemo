package com.example.zhangzhic.zzc.service;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.PlanClass;

import java.util.List;

public interface PlanClassService {
    Result<List<PlanClass>> getList();
    Result<Boolean> create(PlanClass planClass);
    Result<Boolean> uodate(PlanClass planClass);
    Result<Boolean> delete(String id);
    Result<PlanClass>   getDetail(String id);
}
