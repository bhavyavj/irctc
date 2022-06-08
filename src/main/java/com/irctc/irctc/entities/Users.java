package com.irctc.irctc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
@DynamicUpdate
public class Users {

//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long Id;
    private String Uname;
    private Long Tid;
    private String Ctype;
    private int Seats;


}
