package com.irctc.irctc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate
public class Train {
    @Id
    private Long Id;
    private String name;
    private int AC;
    private int NAC;
    private int ST;



}
