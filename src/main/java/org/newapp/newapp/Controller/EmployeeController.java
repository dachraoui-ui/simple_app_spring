package org.newapp.newapp.Controller;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.newapp.newapp.Service.EmployeeService;
import org.newapp.newapp.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/employees")
@AllArgsConstructor

public class EmployeeController {
    public final EmployeeService employeeService;

    @GetMapping
    public String getAllEmployees(Model model){
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employees";
    }


}
