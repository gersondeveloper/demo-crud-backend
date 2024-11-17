package com.badge.democrud.backend.demo_crud_backend.repository;

import com.badge.democrud.backend.demo_crud_backend.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @Query("SELECT e FROM User e")
    Page<User> findAllWithPagination(Pageable pageable);
}
