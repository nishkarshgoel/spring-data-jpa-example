package com.nix.example.jpa.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nix.example.jpa.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

}
