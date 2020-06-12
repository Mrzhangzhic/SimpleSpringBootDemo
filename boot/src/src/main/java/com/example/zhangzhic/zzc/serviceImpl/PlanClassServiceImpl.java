package com.example.zhangzhic.zzc.serviceImpl;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.mapper.PlanClassMapper;
import com.example.zhangzhic.zzc.pojo.PlanClass;
import com.example.zhangzhic.zzc.service.PlanClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
@Deprecated
public class PlanClassServiceImpl implements PlanClassService {
    @Resource
    private PlanClassMapper planClassMapper;
    @Override
    public Result<List<PlanClass>> getList() {
        return null;
    }

    @Override
    public Result<Boolean> create(PlanClass planClass) {
        Result<Boolean> result =new Result<>();
        try {
            int insert = planClassMapper.insert(planClass);
            result.setData(insert==1);
            result.setMessage("插入成功");
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<Boolean> uodate(PlanClass planClass) {
        Result<Boolean> result =new Result<>();
        try {
            int insert = planClassMapper.updateByPrimaryKey(planClass);
            result.setData(insert==1);
            result.setMessage("更新成功");
            result.setSuccess(true);
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
            int insert = planClassMapper.deleteByPrimaryKey(id);
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
    public Result<PlanClass> getDetail(String id) {
        Result<PlanClass> result =new Result<>();
        try {
            PlanClass insert = planClassMapper.selectByPrimaryKey(id);
            result.setMessage("查询成功");
            result.setSuccess(true);
            result.setData(insert);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }
}
