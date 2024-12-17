package com.syuct.mapper;


import com.syuct.pojo.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper {
    Admin getAdminByusername(String username);

    List<String> getRoleByid(int id);

    int getRoleIdByusername(String username);

    int updUserInfo(Admin admin);

    int updUseById(Admin admin);

    List<Admin> getUsers();

    int getUserCounts();

    List<Admin> getUsersByPage(@Param("page") int page,@Param("limit") int limit);

    int addUser(Admin admin);

    Admin getAdminById(int id);

    int updRole(@Param("roleid")String roleid, @Param("adminid")int adminid);

    int updUser(Admin admin);

    int delUserById(int id);

    List<Admin> getUsersByParams(@Param("id")String id, @Param("username")String username,@Param("name") String name,@Param("page") int page,@Param("limit") int limit);

    int getUserCountsByParams(@Param("id")String id,@Param("username") String username, @Param("name")String name);
}
