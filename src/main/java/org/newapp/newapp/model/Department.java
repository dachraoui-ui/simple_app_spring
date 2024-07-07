package org.newapp.newapp.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private int DepartmentId;
    private String name;
    private String branch ;
    private Position position;

}
