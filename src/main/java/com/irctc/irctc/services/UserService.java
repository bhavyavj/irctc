package com.irctc.irctc.services;

import com.irctc.irctc.dto.ViewSeat;
import com.irctc.irctc.entities.Users;
import org.springframework.stereotype.Service;


public interface UserService {
    public Users bookSeat(Users users);
    public String viewSeats(ViewSeat viewSeat);
}
