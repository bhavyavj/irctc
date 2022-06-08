package com.irctc.irctc.controllers;

import com.irctc.irctc.DTO.UpdateCoaches;
import com.irctc.irctc.entities.Train;
import com.irctc.irctc.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/Train")
    public String addTrain(@RequestBody Train train){

        Train t= this.adminService.addTrain(train);
        if(t==null)
        {
            return "train already exists";
        }
        else{
            return "train succesfully added";
        }

    }

    @GetMapping("/Train/{id}")
    public Train getTrain(@PathVariable String id){
        return this.adminService.getTrain(Long.parseLong(id));
    }

    @PutMapping("/AddCoaches")
    public String addCoach(@RequestBody UpdateCoaches updateCoaches){
        return this.adminService.addCoach(updateCoaches);
    }

    @PutMapping("/RemoveCoaches")
    public String removeCoach(@RequestBody UpdateCoaches updateCoaches){
        return this.adminService.removeCoach(updateCoaches);
    }



}
