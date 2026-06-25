package com.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationInfo {
    private String id;
    private String name;
    private String emailId;
    private String city;
    private String country;
    private String uniqueName;

}
