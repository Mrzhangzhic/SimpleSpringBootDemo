package com.example.zhangzhic.zzc.serviceImpl;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.mapper.CurriculumLevelMapper;
import com.example.zhangzhic.zzc.pojo.CurriculumLevel;
import com.example.zhangzhic.zzc.service.CurriculumLevelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CurriculumLevelServiceImpl implements CurriculumLevelService {
    @Resource
    private CurriculumLevelMapper curriculumLevelMapper;
    @Override
    public Result<List<CurriculumLevel>> getList() {
        Result<List<CurriculumLevel>>  result =new Result<>();
      /*  try {
            int update = curriculumLevelMapper.updateByPrimaryKey(curriculumTemplate);
            result.setMessage("更新成功");
            result.setSuccess(true);
            result.setData(update==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }*/
        return result;
    }

    @Override
    public Result<Boolean> create(CurriculumLevel curriculumLevel) {
        Result<Boolean>  result =new Result<>();
        try {
            int update = curriculumLevelMapper.insert(curriculumLevel);
            result.setMessage("更新成功");
            result.setSuccess(true);
            result.setData(update==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<Boolean> uodate(CurriculumLevel curriculumLevel) {
        Result<Boolean>  result =new Result<>();
        try {
            int update = curriculumLevelMapper.updateByPrimaryKey(curriculumLevel);
            result.setMessage("更新成功");
            result.setSuccess(true);
            result.setData(update==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<Boolean> delete(Integer id) {
        Result<Boolean>  result =new Result<>();
        try {
            int update = curriculumLevelMapper.deleteByPrimaryKey(id);
            result.setMessage("更新成功");
            result.setSuccess(true);
            result.setData(update==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<CurriculumLevel> getDetail(Integer id) {
        Result<CurriculumLevel>  result =new Result<>();
        try {
            CurriculumLevel curriculumLevel = curriculumLevelMapper.selectByPrimaryKey(id);
            result.setMessage("更新成功");
            result.setSuccess(true);
            result.setData(curriculumLevel);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }
}
