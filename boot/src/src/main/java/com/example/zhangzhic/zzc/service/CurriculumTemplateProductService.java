package com.example.zhangzhic.zzc.service;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.pojo.CurriculumTemplateProduct;

import java.util.List;

public interface CurriculumTemplateProductService {
    Result<List<CurriculumTemplateProduct>> getList();
    Result<Integer> create(CurriculumTemplateProduct curriculumTemplateProduct);
    Result<Boolean> uodate(CurriculumTemplateProduct curriculumTemplateProduct);
    Result<Boolean> delete(String id);
    Result<CurriculumTemplateProduct>   getDetail(String id);
}
