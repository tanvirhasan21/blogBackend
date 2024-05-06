package com.example.blogBackend.data.reqData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaveUserReqData {
    private String name;
    private String email;
    private String password;
}
