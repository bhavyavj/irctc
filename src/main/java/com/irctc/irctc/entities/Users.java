package com.irctc.irctc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table

public class Users {

//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long Id;
    @Column
    private String Uname;
    @Column
    private Long Tid;
    @Column
    private String Ctype;
    @Column
    private int Seats;


}
