package com.example.returnlistofusersandupdate.data.dto.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserResponseDto {

    private String name;

    private String surname;

    private int age;

    private BigDecimal salary;
}
