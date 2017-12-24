package com.annabon.entity.request;

import java.sql.Date;

public class AddBookingRequest {


    private long itemId;
    private long departmentID;
    private long employeeId;
    private Date deadline;


    public long getItemId() {
        return itemId;
    }
    public void setItemId(long itemId) {
        this.itemId = itemId;
    }

    public long getDepartmentID() {
        return departmentID;
    }
    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }


    public long getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDeadline() {
        return deadline;
    }
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
