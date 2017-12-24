package com.annabon.entity;

import javax.persistence.*;
import java.sql.Date;


@Entity
public class Booking {


    @Id
    @GeneratedValue
    private long id;

    @Column(name = "item_id")
    private long itemId;

    @Column(name = "department_id")
    private long departmentID;

    @Column(name = "employee_id")
    private long employeeId;


    @Column(name = "deadline")
    Date deadline;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getItemId() {
        return itemId;
    }

    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public Booking withItemId(long itemId){
        this.setItemId(itemId);
        return this;
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }

    public Booking withDepertmentId(long departmentID){
        this.setDepartmentID(departmentID);
        return this;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public Booking withEmployeeId(long employeeId){
        this.setEmployeeId(employeeId);
        return this;
    }


    public Date getDeadline() {
        return deadline;
    }

    public Booking withDeadline(Date deadline) {
        this.setDeadline(deadline);
        return this;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
