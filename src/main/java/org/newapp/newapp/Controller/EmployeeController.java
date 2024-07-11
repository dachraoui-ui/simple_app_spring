package org.newapp.newapp.Controller;


import lombok.AllArgsConstructor;
import org.newapp.newapp.Service.EmployeeServiceImpl;
import org.newapp.newapp.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
@AllArgsConstructor

public class EmployeeController {
    public EmployeeServiceImpl employeeService;

    @GetMapping("/")
    public String getAllEmployees(Model model){
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }
    @GetMapping("/ShowNewEmployee")
    public String ShowNewEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "new_employee";
    }
    @PostMapping("/save_emp")
    public String SaveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.SaveEmployee(employee);
        return "redirect:/";
    }
    @GetMapping("/show_update/{id}")
    public String ShowUpdate(@PathVariable(value ="id") Long id , Model model){
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        model.addAttribute("employee",employee);
        return "update_emp";
    }
    @GetMapping("/delete_emp/{id}")
    public String DeleteEmployee(@PathVariable(value = "id") Long id){
        this.employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
}
