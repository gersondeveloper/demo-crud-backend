package com.badge.democrud.backend.demo_crud_backend.controller;

import com.badge.democrud.backend.demo_crud_backend.model.User;
import com.badge.democrud.backend.demo_crud_backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/users")
@CrossOrigin(value = "http://localhost:4200")
public class UserController {

    private final UserService service;

    @GetMapping
    public Page<User> getUsers(Pageable pageable) {
        return service.getPaginatedUsers(pageable);
    }
}
