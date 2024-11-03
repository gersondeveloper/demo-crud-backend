package com.badge.democrud.backend.demo_crud_backend.service;

import com.badge.democrud.backend.demo_crud_backend.model.User;
import com.badge.democrud.backend.demo_crud_backend.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor(onConstructor_ = {@Autowired})
public class UserService {

    private final UserRepository userRepository;

    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
