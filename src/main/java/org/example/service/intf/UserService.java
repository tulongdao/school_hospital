package org.example.service.intf;

public interface UserService {
    //注册
    boolean register( String U_number, String U_password,Integer U_role);
    //校验昵称是否可用
    boolean checkNumber(String U_number);
    //登陆
    boolean login(String U_number, String U_password,Integer U_role);
    //查询列表
    //PageBean queryList();
}
