package com.example.fileupload.mysql.general.security.dao;

import com.example.fileupload.mysql.general.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository< User, Long> {

    @Query(value = "select id from User where employee_id=?1", nativeQuery = true)
    Long findByEmployeeId(@Param( "employee_id" ) Long id);

    @Query("select id from User where username=?1")
    Long findUserIdByUserName(String userName);

    User findByUsername(String name);
}
