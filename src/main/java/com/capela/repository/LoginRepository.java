package com.capela.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capela.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {
}
