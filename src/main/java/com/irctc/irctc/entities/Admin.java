package com.irctc.irctc.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DynamicUpdate
public class Admin {

    @Id
    @Column
    private Long Id;
    @Column
    private String Aname;
    @Column
    private String Pass;

}
