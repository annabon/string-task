package com.annabon.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Order {

    @Id
    @GeneratedValue
    long id;

    long itemId;

    long departmentId;

    long emloyeeId;

    LocalDate deadline;

}
