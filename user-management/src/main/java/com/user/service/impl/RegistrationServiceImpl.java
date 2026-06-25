package com.user.service.impl;

import java.util.UUID;

import com.model.dto.UserRegistrationInfo;
import com.user.service.RegistrationService;

public class RegistrationServiceImpl implements RegistrationService{
    private static final String REGISTER_ID_PREFIX = "REGI_";

    @Override
    public UserRegistrationInfo createRegistrationInfo(UserRegistrationInfo userRegistrationInfo) {
       userRegistrationInfo.setId(REGISTER_ID_PREFIX+ UUID.randomUUID());
       
    }

}
