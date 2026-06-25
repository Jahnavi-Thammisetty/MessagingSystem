package com.model.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginInfo {
    private String id;
    private String emailId;
    private String password;
    private String registrationRefId;
    private List<String> passwordHistory;
    
}
