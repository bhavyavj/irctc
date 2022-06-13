package com.irctc.irctc.services;


import com.irctc.irctc.dto.UpdateCoaches;
import com.irctc.irctc.entities.Train;
import org.springframework.stereotype.Service;


public interface AdminService {
    public Train getTrain(Long id);

    public Train addTrain(Train train);

    public String addCoach(UpdateCoaches updateCoaches);

    public String removeCoach(UpdateCoaches updateCoaches);
}
