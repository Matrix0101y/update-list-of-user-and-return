package com.example.returnlistofusersandupdate.data.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserRequestDto {

    private String name;

    private String surname;

    private int age;

    private BigDecimal salary;
}


