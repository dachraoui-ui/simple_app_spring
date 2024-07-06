package org.newapp.newapp.Controller;

import org.newapp.*;
import org.newapp.newapp.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/employees")
public class EmployeeController {
    public final static List<Employee> employees = new ArrayList<>();

    static {
        for (int i = 0; i < 10 ; i++) {
            employees.add(new Employee(i,"employeeId"+i, "Employee"+i, "Role"+i));
        }
    }
    @GetMapping
    public String getAllEmployees(Model model){
        model.addAttribute("employees",model);
        return "employees";
    }
}
