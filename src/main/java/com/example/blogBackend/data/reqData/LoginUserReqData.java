package com.example.blogBackend.data.reqData;

import lombok.Data;

@Data
public class LoginUserReqData {
    private String email;
    private String password;
}
