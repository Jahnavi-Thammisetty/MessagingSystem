package com.user.facade;

import com.model.dto.ResponseDto;
import com.model.dto.UserRegistrationInfo;

public interface RegisterFacade {
    public ResponseDto createUserRegistraion(UserRegistrationInfo userRegistrationInfo);

}
