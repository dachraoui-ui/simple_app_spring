package org.newapp.newapp.Controller;

import lombok.AllArgsConstructor;
import org.newapp.newapp.Service.EmployeeService;
import org.newapp.newapp.model.Employee;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/employees")
public class EmployeeRestController {
    public final EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(Model model){
         return employeeService.getAllEmployees();

    }
}
