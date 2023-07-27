package com.ronalxie.xpanserver.mapper;

import com.ronalxie.xpanserver.model.FileEntity;
import com.ronalxie.xpanserver.model.FileEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FileEntityMapper {
    long countByExample(FileEntityExample example);

    int deleteByExample(FileEntityExample example);

    int insert(FileEntity record);

    int insertSelective(FileEntity record);

    List<FileEntity> selectByExample(FileEntityExample example);

    int updateByExampleSelective(@Param("record") FileEntity record, @Param("example") FileEntityExample example);

    int updateByExample(@Param("record") FileEntity record, @Param("example") FileEntityExample example);
}