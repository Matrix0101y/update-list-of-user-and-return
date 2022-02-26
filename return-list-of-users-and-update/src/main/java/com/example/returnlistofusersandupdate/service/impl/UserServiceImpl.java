package com.example.returnlistofusersandupdate.service.impl;

import com.example.returnlistofusersandupdate.config.ApplicationConfiguration;
import com.example.returnlistofusersandupdate.data.dto.request.UserRequestDto;
import com.example.returnlistofusersandupdate.data.dto.response.UserResponseDto;
import com.example.returnlistofusersandupdate.data.entity.User;
import com.example.returnlistofusersandupdate.data.repository.UserRepository;
import com.example.returnlistofusersandupdate.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ApplicationConfiguration applicationConfiguration;


    @Override
    public List<UserResponseDto> getListOfUsers() {

        List<User> users = userRepository.findAll();

        List<UserResponseDto> collect = users.stream().map(user -> applicationConfiguration.getModelMapper().map(user, UserResponseDto.class)).collect(Collectors.toList());

        List<UserResponseDto> returnValue = new ArrayList<>();
        users.forEach((user) -> {
            UserResponseDto userResponseDto = applicationConfiguration.getModelMapper().map(user, UserResponseDto.class);
            returnValue.add(userResponseDto);
        });
        return returnValue;
    }

    @Override
    public void updateUser(Long id, UserRequestDto userRequestDto) {
        User updatedUser = userRepository.findById(id).get();
        updatedUser.setName(userRequestDto.getName());
        updatedUser.setSurname(userRequestDto.getSurname());
        updatedUser.setAge(userRequestDto.getAge());
        updatedUser.setSalary(userRequestDto.getSalary());
        userRepository.save(updatedUser);
    }


}
