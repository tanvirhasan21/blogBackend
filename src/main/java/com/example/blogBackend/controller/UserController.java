package com.example.blogBackend.controller;
import com.example.blogBackend.data.reqData.LoginUserReqData;
import com.example.blogBackend.data.reqData.SaveUserReqData;
import com.example.blogBackend.data.resData.LoginUserResData;
import com.example.blogBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    @ResponseBody
    public String saveUser(@RequestBody SaveUserReqData user) {
        String message="";
        try {
            userService.saveUser(user);
            message="user saved successfully";
        } catch (Exception e) {
            e.printStackTrace();
            message="couldn't save user";
        }
        return message;
    }

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public LoginUserResData loginUser(@RequestBody LoginUserReqData user) {
        LoginUserResData u=new LoginUserResData();
        try {
             u = userService.loginUser(user);
            System.out.println(u);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return u;
    }

}
