package org.example.service.impl;


import org.example.dao.UserDao;
import org.example.entity.User;
import org.example.service.intf.UserService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Base64;


@Service
public class UserServiceImpl implements UserService {
  @Resource
    private UserDao userDao;

    @Override
    public boolean register(String U_number, String U_password, Integer U_role) {
       // String pass = Base64.getEncoder().encodeToString(U_number.getBytes());
        int i = userDao.insertUser(U_number, U_password,U_role);
        if (i > 0) {
            return true;
        }
        return false;
    }
    @Override
    public boolean login(String U_number, String U_password, Integer U_role) {
        User user = userDao.selectByNumber(U_number);
        if(user!=null){
            if (user.getPassword().equals(Base64.getEncoder().encodeToString(U_password.getBytes()))) {
                    return true;
                }
        }
        return false;
    }

    @Override
    public boolean checkNumber(String nickname) {
        User user = userDao.selectByNumber(nickname);
        if (user != null) {
                return true;
            }
        return false;
    }

}