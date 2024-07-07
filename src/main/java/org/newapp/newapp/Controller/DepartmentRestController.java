package org.newapp.newapp.Controller;

import lombok.AllArgsConstructor;
import org.newapp.newapp.Service.DepartmentService;
import org.newapp.newapp.model.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/department")
public class DepartmentRestController {
    public final DepartmentService departmentService;

    @GetMapping
    public List<Department> getDepartment(){
        return departmentService.getDepartments();

    }

}
