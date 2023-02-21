package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.example.entity.User;

import java.util.List;


public interface HomeDao {
    //增加用户
   int insertUser(@Param("U_number") String U_number, @Param("U_password") String U_password, @Param("U_role") Integer U_role);
    //查询用户
    User selectByNumber(String U_number);
//     * 查询全部*/
    List<User> selectAll();
}
