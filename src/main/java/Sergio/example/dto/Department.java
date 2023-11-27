package Sergio.example.dto;

import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@ToString
@Getter
@AllArgsConstructor
@Setter
@EqualsAndHashCode

//the fields for the department class
public class Department {
    private static int nextId = 1;

    private String name;
    private String departmentId;

    //method that receives the requested info
    public Department(String name) {
        this.departmentId = String.format("D%03d", nextId++);
        this.name = name;
    }

    //toString method that adjusts the string
    @Override
    public String toString() {
        return "Department{id = " + departmentId + ", name = " + name + "}";
    }
}

