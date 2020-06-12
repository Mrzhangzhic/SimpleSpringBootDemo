package generate;

import com.example.zhangzhic.zzc.pojo.PlanClass;

public interface PlanClassDao {
    int deleteByPrimaryKey(String id);

    int insert(PlanClass record);

    int insertSelective(PlanClass record);

    PlanClass selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(PlanClass record);

    int updateByPrimaryKey(PlanClass record);
}