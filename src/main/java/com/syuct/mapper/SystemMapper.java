package com.syuct.mapper;


import com.syuct.pojo.Function;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SystemMapper {


    int addRoleAdmin(@Param("roleid")String roleid,@Param("autoid") int autoid);

    List<Function> getFunctionInfo();

    int getFunctionCounts();

    void banFunctionById(int id);

    void openFunctionById(int id);

    void banAllFunctionById(int id);

    void openAllFunctionById(int id);
}
