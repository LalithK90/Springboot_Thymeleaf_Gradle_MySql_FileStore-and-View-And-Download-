package com.example.fileupload.mysql.repository;

import com.example.fileupload.mysql.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository< User, Long > {
}
