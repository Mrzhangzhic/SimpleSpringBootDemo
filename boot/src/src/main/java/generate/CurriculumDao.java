package generate;

import com.example.zhangzhic.zzc.pojo.Curriculum;

public interface CurriculumDao {
    int deleteByPrimaryKey(String id);

    int insert(Curriculum record);

    int insertSelective(Curriculum record);

    Curriculum selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Curriculum record);

    int updateByPrimaryKey(Curriculum record);
}