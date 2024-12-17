package com.syuct.mapper;

import com.syuct.pojo.Admin;
import com.syuct.pojo.Log;
import com.syuct.pojo.vo.LogVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogMapper {


    int saveLog(Log log);

    List<Log> getLogByPage(@Param("page")int page, @Param("limit") int limit);

    int getLogCounts();

    void delLog(int id);

    List<Log> getLogByParams(@Param("username")String username,@Param("name") String name, @Param("module")String module, @Param("page")int page, @Param("limit") int limit);

    int getLogCountsByParams(@Param("username")String username,@Param("name") String name, @Param("module")String module);

}
