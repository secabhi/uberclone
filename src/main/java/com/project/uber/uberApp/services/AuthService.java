package com.project.uber.uberApp.services;

import com.project.uber.uberApp.dto.DriverDto;
import com.project.uber.uberApp.dto.SignupDto;
import com.project.uber.uberApp.dto.UserDto;

public interface AuthService {
    String login(String username, String password);
    UserDto Signup(SignupDto signupDto);
    DriverDto onBoardNewDriver(Long userId);
}
