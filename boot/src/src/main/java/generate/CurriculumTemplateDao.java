package generate;

import generate.CurriculumTemplate;

public interface CurriculumTemplateDao {
    int deleteByPrimaryKey(String id);

    int insert(CurriculumTemplate record);

    int insertSelective(CurriculumTemplate record);

    CurriculumTemplate selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CurriculumTemplate record);

    int updateByPrimaryKey(CurriculumTemplate record);
}