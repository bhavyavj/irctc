package com.irctc.irctc.dao;

import com.irctc.irctc.entities.Admin;
import com.irctc.irctc.entities.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminDao extends JpaRepository<Admin,Long>{
}
