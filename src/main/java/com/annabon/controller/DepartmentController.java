package com.annabon.controller;


import com.annabon.entity.Booking;
import com.annabon.entity.Department;
import com.annabon.entity.request.AddBookingRequest;
import com.annabon.entity.request.AddDepartmentRequest;
import com.annabon.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/departments")
public class DepartmentController {


    private DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentController(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Department> findAllDepartments(){
        return departmentRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addDepartment(@RequestBody AddDepartmentRequest addDepartmentRequest){
        departmentRepository.save(new Department().withName(addDepartmentRequest.getName()));
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Department getDepartment(@PathVariable long id){
        return departmentRepository.getOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteDepartment(@PathVariable long id){
        departmentRepository.delete(id);
    }

}
