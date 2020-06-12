package generate;

import generate.CurriculumLevelTwo;

public interface CurriculumLevelMapperTwo {
    int deleteByPrimaryKey(Integer id);

    int insert(CurriculumLevelTwo record);

    int insertSelective(CurriculumLevelTwo record);

    CurriculumLevelTwo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CurriculumLevelTwo record);

    int updateByPrimaryKey(CurriculumLevelTwo record);
}