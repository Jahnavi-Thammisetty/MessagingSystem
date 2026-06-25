package com.user.facade.impl;

import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import com.model.dto.ResponseDto;
import com.model.dto.UserRegistrationInfo;
import com.user.facade.RegisterFacade;

public class RegistrationFacadeImpl implements RegisterFacade {

    @Override
    public ResponseDto createUserRegistraion(UserRegistrationInfo userRegistrationInfo) {
        if(Objects.isNull(userRegistrationInfo)){
            return new ResponseDto(HttpStatus.INSUFFICIENT_STORAGE.value(), "Insufficient Data",null, "Success" );
        }

    }

}
