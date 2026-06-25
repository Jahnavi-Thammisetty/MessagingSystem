package com.user.dao;

import com.model.dto.UserRegistrationInfo;

public interface RegisterDao {

    public UserRegistrationInfo saveUserRegistrationInfo(UserRegistrationInfo userRegistrationInfo);
}
