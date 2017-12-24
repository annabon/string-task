package com.annabon.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private long id;



    @Column(name = "department_id")
    private String departmentId;


    @Column(name = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    private void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Employee withDepartmentId(String departmentId){
        this.setDepartmentId(departmentId);
        return this;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Employee withName(String name){
        this.setName(name);
        return this;
    }
}
