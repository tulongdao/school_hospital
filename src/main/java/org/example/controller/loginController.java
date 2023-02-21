package org.example.controller;

import org.example.service.intf.UserService;
import org.example.util.RUtil;
import org.example.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class loginController {
    @Autowired
    private UserService service;
    @RequestMapping("/api/register/insert.do")
    @ResponseBody
    public R register(String account, String pass, Integer role){
        boolean r = service.register(account, pass,role);
       if (!r){
           RUtil.fail();
       }
        return RUtil.ok();
    }
    @RequestMapping("/api/login/insert.do")
    @ResponseBody
    public R login(String account, String pass, Integer U_role){
        boolean r = service.login(account, pass,U_role);
        if (!r){
            RUtil.fail();
        }
        return RUtil.ok();
    }
    @RequestMapping("/api/admin/logout.do")
    @ResponseBody
    public R logout(HttpSession session){
        session.invalidate();
        return RUtil.ok();
    }
}
