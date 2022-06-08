package com.irctc.irctc.dao;

import com.irctc.irctc.entities.Train;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface TrainDao extends JpaRepository<Train,Long> {

}
