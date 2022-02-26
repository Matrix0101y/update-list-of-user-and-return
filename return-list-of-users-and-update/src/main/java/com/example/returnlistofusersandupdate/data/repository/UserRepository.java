package com.example.returnlistofusersandupdate.data.repository;

import com.example.returnlistofusersandupdate.data.dto.request.UserRequestDto;
import com.example.returnlistofusersandupdate.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
