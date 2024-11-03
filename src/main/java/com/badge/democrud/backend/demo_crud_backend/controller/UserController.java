package com.badge.democrud.backend.demo_crud_backend.controller;

import com.badge.democrud.backend.demo_crud_backend.model.User;
import com.badge.democrud.backend.demo_crud_backend.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/")
public class UserController {

    private final UserService userService;

    @GetMapping("users")
    public Page<User> getUsers(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return userService.findAll(pageable);
    }

//    @GetMapping("api/users/{id}")
//    public ResponseEntity<User> getUser(@PathVariable Long id) {
//        return new ResponseEntity<>(userService.findById(id), HttpStatus.OK);
//    }
}
