package org.newapp.newapp.Service;

import org.newapp.newapp.model.Employee;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface IEmployeeService {
    List<Employee> getAllEmployees();
    void SaveEmployee(Employee employee);
    Optional<Employee> getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
