package com.irctc.irctc.dao;

import com.irctc.irctc.entities.Train;
import com.irctc.irctc.entities.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<Users,Long> {
}
