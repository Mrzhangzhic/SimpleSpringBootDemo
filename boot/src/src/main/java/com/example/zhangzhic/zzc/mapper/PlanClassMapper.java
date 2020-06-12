package com.example.zhangzhic.zzc.mapper;

import com.example.zhangzhic.zzc.pojo.PlanClass;
@Deprecated
public interface PlanClassMapper {
    int deleteByPrimaryKey(String id);

    int insert(PlanClass record);

    int insertSelective(PlanClass record);

    PlanClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PlanClass record);

    int updateByPrimaryKey(PlanClass record);
}