package com.example.woof.model;

public class Employee {

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;



    public Employee() {
    }

    public Employee(Integer id, String firstName, String lastName, String email) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public Integer getId() {
        return id;
    }

//    why does a setter use the void and have integer id in ()?
    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
