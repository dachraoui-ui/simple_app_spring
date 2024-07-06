package org.newapp.newapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Employee {
    private long id;
    private String employeeId;
    private String name;
    private String role;



}
