package org.newapp.newapp.Service;

import org.newapp.newapp.model.Employee;
import org.newapp.newapp.model.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    private IEmployeeRepo employeeRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public void SaveEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public Optional<Employee> getEmployeeById(long id) {
        if(employeeRepo.findById(id).isPresent()){
            return employeeRepo.findById(id);
        }
        else {
            return Optional.empty();
        }
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepo.deleteById(id);
    }




}
