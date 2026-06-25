package com.user.UserController;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.dto.ResponseDto;
import com.model.dto.UserRegistrationInfo;

@RestController
public class RegistrationController {

    public ResponseDto createRegistrationDetails(@RequestBody UserRegistrationInfo userRegistrationInfo){
        return null;
    }
}
