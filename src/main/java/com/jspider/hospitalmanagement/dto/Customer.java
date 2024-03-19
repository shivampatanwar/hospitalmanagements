package com.jspider.hospitalmanagement.dto;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Customer {

    @Size(min = 3, max = 10)
    String username;

    @NotEmpty
    @Email
    String email;

    @NotNull
    @DecimalMax(value = "99999999999")
    @DecimalMin(value = "6000000000")
    long mobile;

    @NotEmpty
    @Size(min = 8, max = 15)
    String password;

    @NotEmpty
    @Size(min = 8, max = 15)
    String repassword;
    
    

}
