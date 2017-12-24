package com.annabon.controller;


import com.annabon.entity.Employee;
import com.annabon.entity.request.AddEmployeeRequest;
import com.annabon.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/all")
    public List<Employee> findAllEmployees(){
        return employeeRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add")
    public void addEmployee(@RequestBody AddEmployeeRequest addEmployeeRequest){
        employeeRepository.save(new Employee().withDepartmentId(addEmployeeRequest.getDepartmentId())
                                              .withName(addEmployeeRequest.getName()));
    }

    @RequestMapping(method = RequestMethod.GET, value = "{id}")
    public Employee getEmployee(@PathVariable long id){
        return employeeRepository.getOne(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "{id}")
    public void deleteEmployee(@PathVariable long id){
        employeeRepository.delete(id);
    }
}
