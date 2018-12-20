package com.decdemojpa.jpademo.controller;

import com.decdemojpa.jpademo.model.Employee;
import com.decdemojpa.jpademo.repos.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by abhi on 20/12/18.
 */

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepo employeeRepo;

    @PostMapping(value="/saveemp")
    public String saveData(@RequestBody Employee employee){
        employeeRepo.save(employee);
        return "data saved";
    }
}
