package com.irctc.irctc.services;

import com.irctc.irctc.entities.Users;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public Users bookSeat(Users users);

}
