package com.csa.samplefullstack.controllers;

import com.csa.samplefullstack.entities.Employee;
import com.csa.samplefullstack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;

import java.util.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class EmployeeController {
    
    @Autowired  // spring - dependency injection
    private EmployeeRepository employeeRepository;
    
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
    
    @PostMapping("/employees")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id).get();
    }
    
    @PutMapping("/employees")
    public Employee putEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }
    
    @DeleteMapping("/employees/{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable Long id){
        employeeRepository.deleteById(id);
        return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
    }
}
