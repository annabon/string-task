package com.annabon.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Department {


    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String  name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Department withName(String name){
        this.setName(name);
        return this;
    }
}
