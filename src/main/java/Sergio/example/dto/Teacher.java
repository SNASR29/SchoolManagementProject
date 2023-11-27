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

//the fields for this class
public class Teacher {
    public static int nextId = 1;

   private String lastName;
   private String firstName;
   private String teacherId;
   private Department department;
   private String name;

   //method that receives the info requested
   public Teacher(String lastName, String firstName, Department department){
       this.teacherId = String.format("T%03d", nextId++);
       this.lastName = lastName;
       this.firstName = firstName;
       this.department = department;
   }

   //toString method that adjusts the string format
   @Override
   public String toString() {
       return "Teacher{id = " + teacherId + ", First name = " + firstName + ", Last name = " + lastName + ", department = " + department + "}";
   }
}
