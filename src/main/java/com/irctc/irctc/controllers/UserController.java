package com.irctc.irctc.controllers;

import com.irctc.irctc.dto.ViewSeat;
import com.irctc.irctc.entities.Users;
import com.irctc.irctc.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/Book")
    public String bookSeat(@RequestBody Users users){

       // Train t= this.adminService.addTrain(train);
        Users u=this.userService.bookSeat(users);
        if(u==null)
        {
            return "Seat not available";
        }
        else{
            return "Seat succesfully booked";
        }

    }

    @GetMapping("/View")
    public String viewSeats(@RequestBody ViewSeat viewSeat){
        return this.userService.viewSeats(viewSeat);
    }





}
