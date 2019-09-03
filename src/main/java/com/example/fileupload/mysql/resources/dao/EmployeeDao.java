package com.example.fileupload.mysql.resources.dao;

import com.example.fileupload.mysql.resources.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository< Employee, Long> {
    Employee findFirstByOrderByIdDesc();

}
