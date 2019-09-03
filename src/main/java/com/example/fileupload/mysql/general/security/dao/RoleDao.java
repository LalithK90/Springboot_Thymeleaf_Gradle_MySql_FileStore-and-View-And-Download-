package com.example.fileupload.mysql.general.security.dao;

import com.example.fileupload.mysql.general.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends JpaRepository< Role, Long> {
}
