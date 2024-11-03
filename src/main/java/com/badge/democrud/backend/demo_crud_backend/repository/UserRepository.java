package com.badge.democrud.backend.demo_crud_backend.repository;

import com.badge.democrud.backend.demo_crud_backend.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
