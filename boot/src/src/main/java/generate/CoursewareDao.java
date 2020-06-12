package generate;

import com.example.zhangzhic.zzc.pojo.Courseware;

public interface CoursewareDao {
    int deleteByPrimaryKey(String id);

    int insert(Courseware record);

    int insertSelective(Courseware record);

    Courseware selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Courseware record);

    int updateByPrimaryKey(Courseware record);
}