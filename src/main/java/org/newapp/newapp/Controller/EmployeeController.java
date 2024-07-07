package org.newapp.newapp.Controller;


import lombok.AllArgsConstructor;
import org.newapp.newapp.Service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



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
