package com.example.returnlistofusersandupdate.controller;

import com.example.returnlistofusersandupdate.data.dto.request.UserRequestDto;
import com.example.returnlistofusersandupdate.data.dto.response.UserResponseDto;
import com.example.returnlistofusersandupdate.data.entity.User;
import com.example.returnlistofusersandupdate.data.repository.UserRepository;
import com.example.returnlistofusersandupdate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;

    @GetMapping("/users")
    public List<UserResponseDto> getListOfUsersInfo(){
        return userService.getListOfUsers();
    }

    @PutMapping("/update/{id}")
    public void updateUser( @PathVariable Long id, @RequestBody UserRequestDto userRequestDto){
        userService.updateUser(id, userRequestDto);
    }
    
}
