package org.newapp.newapp.Service;

import org.newapp.newapp.model.Department;
import org.newapp.newapp.model.Position;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    public final static List<Department> departments = new ArrayList<>();
    static {
        departments.add(new Department(1,"IT department","IT", Position.Manager));
        departments.add(new Department(2,"HR department","HR", Position.Member));
        departments.add(new Department(3,"Engineering department","ENG", Position.TeamLeader));
    }
    public List<Department> getDepartments(){
        return departments;
    }
}
