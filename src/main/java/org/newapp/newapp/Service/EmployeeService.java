package org.newapp.newapp.Service;

import org.newapp.newapp.model.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void SaveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
