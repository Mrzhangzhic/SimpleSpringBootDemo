package com.example.zhangzhic.zzc.serviceImpl;

import com.example.zhangzhic.zzc.common.Result;
import com.example.zhangzhic.zzc.mapper.CurriculumLevelMapper;
import com.example.zhangzhic.zzc.mapper.CurriculumTemplateMapper;
import com.example.zhangzhic.zzc.mapper.CurriculumTemplateProductMapper;
import com.example.zhangzhic.zzc.mapper.PlanClassMapper;
import com.example.zhangzhic.zzc.pojo.*;
import com.example.zhangzhic.zzc.service.CurriculumLevelService;
import com.example.zhangzhic.zzc.service.CurriculumTemplateProductService;
import com.example.zhangzhic.zzc.service.CurriculumTemplateService;
import com.example.zhangzhic.zzc.service.PlanClassService;
import org.omg.PortableInterceptor.INACTIVE;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class CurriculumTemplateServiceImpl implements CurriculumTemplateService {
    @Resource
    private CurriculumTemplateMapper curriculumTemplateMapper;
    @Resource
    private CurriculumTemplateProductMapper curriculumTemplateProductMapper;
    @Resource
    private CurriculumLevelMapper curriculumLevelMapper;
    @Resource
    private PlanClassMapper planClassMapper;
    @Resource
    private CurriculumTemplateProductService curriculumTemplateProductService;
    @Resource
    private PlanClassService planClassService;
    @Resource
    private CurriculumLevelService curriculumLevelService;
    @Override
    public Result<List<CurriculumTemplate>> getList() {
        return null;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result<Boolean> create(CurriculumTemplate curriculumTemplate) {
        Map<String,Integer> map=new HashMap();
        Result<Boolean>  result =new Result<>();
        try {
            CurriculumLevel curriculumLevel =new CurriculumLevel();
            List<CurriculumLevel> levels  =curriculumTemplate.getCurriculumLevel();
            //课程模板的添加
            curriculumTemplate.setCreateDataTime(new Date());
            curriculumTemplate.setUpdateDataTime(new Date());
            Map<String,Integer> map1 =new ConcurrentHashMap<String,Integer>();
            int insert = curriculumTemplateMapper.insert(curriculumTemplate);
            //产品形式的添加
            if (curriculumTemplate.getCurriculumTemplateProduct()!=null){

                //上课安排的添加

                CurriculumTemplateProduct curriculumTemplateProduct =curriculumTemplate.getCurriculumTemplateProduct();
                curriculumTemplateProduct.setCurriculumTemplateId(curriculumTemplate.getId());
                curriculumTemplateProduct.setCreateDataTime(new Date());
                curriculumTemplateProduct.setUpdateDataTime(new Date());
                curriculumTemplateProductMapper.insert(curriculumTemplateProduct);
                map1.put("urriculumTemplateProductId",curriculumTemplateProduct.getId());
                curriculumLevel.setCurriculumTemplateProductId(curriculumTemplateProduct.getId());
            }
            //课程层级的添加
            for (CurriculumLevel cu:levels) {
                //一级标题的添加
                if (cu.getParentId() == 0 && cu.getLevel()==1){
                    cu.setCreateDataTime(new Date());
                    cu.setUpdateDataTime(new Date());
                    cu.setCurriculumTemplateProductId(map1.get("urriculumTemplateProductId"));
                    Result<Boolean> result1 = curriculumLevelService.create(cu);
                }
                //二级标题的添加
                if ( cu.getLevel()==2){
                    cu.setCreateDataTime(new Date());
                    cu.setUpdateDataTime(new Date());
                    cu.setCurriculumTemplateProductId(map1.get("urriculumTemplateProductId"));
                    Result<Boolean> result1 = curriculumLevelService.create(cu);
                }
                //三级标题的添加
                if ( cu.getLevel()==3){
                    cu.setCreateDataTime(new Date());
                    cu.setUpdateDataTime(new Date());
                    cu.setCurriculumTemplateProductId(map1.get("urriculumTemplateProductId"));
                    Result<Boolean> result1 = curriculumLevelService.create(cu);
                }
            }
            result.setData(insert==1);
            result.setMessage("增加成功");
            result.setSuccess(true);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<Boolean> uodate(CurriculumTemplate curriculumTemplate) {
        Result<Boolean>  result =new Result<>();
        try {
            //模板的更新
            int update = curriculumTemplateMapper.updateByPrimaryKey(curriculumTemplate);
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
    public Result<Boolean> delete(String id) {
        Result<Boolean>  result =new Result<>();
        try {
            //模板的逻辑删除
            int update = curriculumTemplateMapper.deleteByPrimaryKey(id);
            result.setMessage("删除成功");
            result.setSuccess(true);
            result.setData(update==1);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

    @Override
    public Result<CurriculumTemplate> getDetail(String id) {
        Result<CurriculumTemplate>  result =new Result<>();
        try {
            //模板的详情
            CurriculumTemplate detail = curriculumTemplateMapper.selectByPrimaryKey(id);
            result.setMessage("查询成功");
            result.setSuccess(true);
            result.setData(detail);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }
    //模板列表
    @Override
    public Result<List<CurriculumTemplate>> getList(CurriculumTemplate curriculumTemplate) {
        Result<List<CurriculumTemplate>>  result =new Result<>();
        try {

            List<CurriculumTemplate> list = curriculumTemplateMapper.select(curriculumTemplate);
            result.setMessage("查询成功");
            result.setSuccess(true);
            result.setData(list);
        } catch (Exception e) {
            e.printStackTrace();
            result.setMessage("系统异常");
        }
        return result;
    }

}
