package com.ashutosh.backendapring3.repository;


import com.ashutosh.backendapring3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<com.ashutosh.backendapring3.model.User, Long> {

}
