package com.example.woof;


import com.example.woof.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAO {

    private static Employees list = new Employees();

    static {

        list.getEmployeeList().add(
                new Employee(
                        1,
                        "Frank",
                        "Sinatra",
                        "therealdeal@gmail.com"
                )
        );

        list.getEmployeeList().add(
                new Employee(
                        2,
                        "Grant",
                        "Pickle",
                        "GrantPickle@gmail.com"
                )
        );

        list.getEmployeeList().add(
                new Employee(
                        3,
                        "Hinky",
                        "Early",
                        "HinkyEarly@gmail.com"
                )
        );

        list.getEmployeeList().add(
                new Employee(
                        4,
                        "Jerry",
                        "Linde",
                        "Howdareyou@gmail.com"
                )
        );

    }

    public Employees getAllEmployees(){
        return list;
    }

    public void addEmployee(Employee employee){

        list.getEmployeeList().add(employee);
    }



}
