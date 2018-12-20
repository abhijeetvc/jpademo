package com.decdemojpa.jpademo.repos;

import com.decdemojpa.jpademo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by abhi on 20/12/18.
 */
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
