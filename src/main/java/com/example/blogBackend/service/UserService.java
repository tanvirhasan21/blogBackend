package com.example.blogBackend.service;

import com.example.blogBackend.data.reqData.LoginUserReqData;
import com.example.blogBackend.data.reqData.SaveUserReqData;
import com.example.blogBackend.data.resData.LoginUserResData;

public interface UserService {
    void saveUser(SaveUserReqData user);

    LoginUserResData loginUser(LoginUserReqData user);
}
