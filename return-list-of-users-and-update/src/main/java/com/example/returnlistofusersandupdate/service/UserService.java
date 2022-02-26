package com.example.returnlistofusersandupdate.service;

import com.example.returnlistofusersandupdate.data.dto.request.UserRequestDto;
import com.example.returnlistofusersandupdate.data.dto.response.UserResponseDto;

import java.util.List;

public interface UserService {
    List<UserResponseDto> getListOfUsers();

    void updateUser(Long id, UserRequestDto userRequestDto);
}
