package org.newapp.newapp.Service;

import org.newapp.newapp.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    public final static List<Employee> EMPLOYEES = new ArrayList<>();
    static {
        for (int i = 0; i < 10 ; i++) {
            EMPLOYEES.add(new Employee(i,"employeeId"+i, "Employee"+i, "Role"+i));
        }
    }

    public List<Employee> getAllEmployees(){
        return EMPLOYEES;
    }
}
