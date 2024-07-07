package org.newapp.newapp.Controller;

import lombok.AllArgsConstructor;
import org.newapp.newapp.Service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/department")
@AllArgsConstructor
public class DepartmentController {
    public final DepartmentService departmentService;

    @GetMapping
    public String getDepartment(Model model){
        model.addAttribute("department",departmentService.getDepartments());
        return "department";
    }


}
