package com.nku.mapper;

import com.nku.entity.ZsLogin;
import com.nku.entity.ZsLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZsLoginMapper {
    long countByExample(ZsLoginExample example);

    int deleteByExample(ZsLoginExample example);

    int insert(ZsLogin record);

    int insertSelective(ZsLogin record);

    List<ZsLogin> selectByExample(ZsLoginExample example);

    int updateByExampleSelective(@Param("record") ZsLogin record, @Param("example") ZsLoginExample example);

    int updateByExample(@Param("record") ZsLogin record, @Param("example") ZsLoginExample example);
}