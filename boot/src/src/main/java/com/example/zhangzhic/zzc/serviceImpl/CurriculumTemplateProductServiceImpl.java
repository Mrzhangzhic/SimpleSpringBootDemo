package com.example.zhangzhic.zzc.serviceImpl;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.mapper.CurriculumTemplateProductMapper;
import com.example.zhangzhic.zzc.pojo.CurriculumTemplateProduct;
import com.example.zhangzhic.zzc.service.CurriculumTemplateProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CurriculumTemplateProductServiceImpl implements CurriculumTemplateProductService {
    @Resource
    private CurriculumTemplateProductMapper curriculumTemplateProductMapper;
    @Override
    public Result<List<CurriculumTemplateProduct>> getList() {

        return null;
    }

    @Override
    public Result<Integer> create(CurriculumTemplateProduct curriculumTemplateProduct) {
        Result<Integer> result =new Result<>();
        try {
            Integer insert = curriculumTemplateProductMapper.insert(curriculumTemplateProduct);
            result.setMessage("新增成功");
            result.setSuccess(true);
            result.setData(insert);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<Boolean> uodate(CurriculumTemplateProduct curriculumTemplateProduct) {
        Result<Boolean> result =new Result<>();
        try {
            int insert = curriculumTemplateProductMapper.updateByPrimaryKey(curriculumTemplateProduct);
            result.setMessage("更新成功");
            result.setSuccess(true);
            result.setData(insert==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<Boolean> delete(String id) {
        Result<Boolean> result =new Result<>();
        try {
            int insert = curriculumTemplateProductMapper.deleteByPrimaryKey(id);
            result.setMessage("删除成功");
            result.setSuccess(true);
            result.setData(insert==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<CurriculumTemplateProduct> getDetail(String id) {
        Result<CurriculumTemplateProduct> result =new Result<>();
        try {
            CurriculumTemplateProduct detail = curriculumTemplateProductMapper.selectByPrimaryKey(id);
            result.setData(detail);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }
}
