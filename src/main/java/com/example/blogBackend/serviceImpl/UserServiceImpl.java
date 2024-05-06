package com.example.blogBackend.serviceImpl;

import com.example.blogBackend.data.reqData.LoginUserReqData;
import com.example.blogBackend.data.reqData.SaveUserReqData;
import com.example.blogBackend.data.resData.LoginUserResData;
import com.example.blogBackend.entity.User;
import com.example.blogBackend.repository.UserRepository;
import com.example.blogBackend.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public void saveUser(SaveUserReqData user) {
        User newUser=new User();
        BeanUtils.copyProperties(user,newUser);

        userRepository.save(newUser);
    }

    @Override
    public LoginUserResData loginUser(LoginUserReqData user) {
        LoginUserResData resData = new LoginUserResData();
        User user1 = userRepository.findByEmail(user.getEmail());
        if(user1.getPassword().equals(user.getPassword())){
            System.out.println("Login successful");
            BeanUtils.copyProperties(user1,resData);
            System.out.println(user1);
            System.out.println(resData);
        }
        return resData;
    }
}
