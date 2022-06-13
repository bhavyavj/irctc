package com.irctc.irctc.services.impl;

import com.irctc.irctc.dto.UpdateCoaches;
import com.irctc.irctc.dao.AdminDao;
import com.irctc.irctc.dao.TrainDao;
import com.irctc.irctc.entities.Train;
import com.irctc.irctc.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

   @Autowired
   private AdminDao adminDao;

    @Autowired
    private TrainDao trainDao;
    @Override
    public Train addTrain(Train train)
    {
        Train t= trainDao.findById(train.getId()).orElse(null);
        if(t==null)
        {
            trainDao.save(train);
            return train;
        }
        else{
            return null;
        }

    }

    @Override
    public String  addCoach(UpdateCoaches updateCoaches) {

        Train t= trainDao.findById(updateCoaches.getId()).orElse(null);
        if(t==null)
        {
            return "Train not present";
        }
        else{
            String type= updateCoaches.getCoachType();
            if(type=="AC")
            {
                t.setAC(t.getAC()+60);
            }
            else if(type=="NAC"){
                t.setNAC(t.getNAC()+60);
            }
            else if(type=="ST"){
                t.setST(t.getST()+120);
            }
            else return "Coach does not exist";
        }
        trainDao.save(t);
        return "Coaches added successfully";

    }

    @Override
    public String removeCoach(UpdateCoaches updateCoaches){
        Train t=trainDao.findById(updateCoaches.getId()).orElse(null);
        if(t==null){
            return "Train does not exist";
        }
        else{
            String type= updateCoaches.getCoachType();
            if(type=="AC")
            {
                if(t.getAC()-60>0)
                t.setAC(t.getAC()-60);
                else
                    t.setAC(0);
            }
            else if(type=="NAC"){
                if(t.getNAC()-60>0)
                    t.setNAC(t.getNAC()-60);
                else
                    t.setNAC(0);
            }
            else if(type=="ST"){
                if(t.getST()-120>0)
                    t.setST(t.getST()-120);
                else
                    t.setST(0);
            }
            else return "Coach does not exist";
        }
        trainDao.save(t);
        return "Coaches added successfully";
    }
    @Override
    public Train getTrain(Long id){
        Train t= trainDao.findById(id).orElse(null);
        return t;
    }


}
