package com.project.uber.uberApp.services.Impl;

import com.project.uber.uberApp.dto.DriverDto;
import com.project.uber.uberApp.dto.SignupDto;
import com.project.uber.uberApp.dto.UserDto;
import com.project.uber.uberApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    @Override
    public String login(String username, String password) {
        return "";
    }

    @Override
    public UserDto Signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onBoardNewDriver(Long userId) {
        return null;
    }
}
