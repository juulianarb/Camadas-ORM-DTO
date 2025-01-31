package com.aulaCamadasPackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaCamadasPackage.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
