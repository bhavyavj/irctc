package com.irctc.irctc.services.impl;

import com.irctc.irctc.dto.ViewSeat;
import com.irctc.irctc.dao.TrainDao;
import com.irctc.irctc.dao.UserDao;
import com.irctc.irctc.entities.Train;
import com.irctc.irctc.entities.Users;
import com.irctc.irctc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserService {

    @Autowired
    private TrainDao trainDao;
    @Autowired
    private UserDao userDao;
    @Override
    public Users bookSeat(Users users) {

        Train t= trainDao.findById(users.getTid()).orElse(null);
        if(t==null){
            return null;
        }
        else{
            String c = users.getCtype();
            if (c == "AC") {
                if(users.getSeats()<t.getAC()){
                    t.setAC(t.getAC()- users.getSeats());
                }
                else
                    return null;
            }
            else if (c == "NAC") {
                if(users.getSeats()<t.getNAC()){
                    t.setNAC(t.getNAC()- users.getSeats());
                }
                else
                    return null;
            }
            else
            if (c == "ST") {
                if(users.getSeats()<t.getST()){
                    t.setST(t.getST()- users.getSeats());
                }
                else
                    return null;
            }
            else
                return null;
        }


        trainDao.save(t);
        userDao.save();

        return users;
    }

    @Override
    public String viewSeats(ViewSeat viewSeat) {
        Train t= trainDao.findById(viewSeat.getId()).orElse(null);
        if(t==null){
            return null;
        }
        else{
            String c = viewSeat.getCoachType();
            if (c == "AC") {
                return Integer.toString(t.getAC());
            }
            else if (c == "NAC") {
                return Integer.toString(t.getNAC());
            }
            else
            if (c == "ST") {
                return Integer.toString(t.getST());
            }
            else
                return null;
        }
    }
}
