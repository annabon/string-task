package com.annabon.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private long id;


    @Column(name = "department_id")
    private long departmentId;


    @Column(name = "name")
    private String name;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    private void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }

    public Item withDepartmentId(long departmentId){
        this.setDepartmentId(departmentId);
        return this;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Item withName(String name){
        this.setName(name);
        return this;
    }
}
