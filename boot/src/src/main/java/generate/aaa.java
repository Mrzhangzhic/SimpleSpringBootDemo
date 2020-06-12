package generate;

import generate.aaa;

public interface aaa {
    int deleteByPrimaryKey(String id);

    int insert(aaa record);

    int insertSelective(aaa record);

    aaa selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(aaa record);

    int updateByPrimaryKey(aaa record);
}