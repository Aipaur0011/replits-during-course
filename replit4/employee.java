package Replits.replit4;
/*
1. Complete the Employee.java class:

Include the following class variables:
* name(String)
* lastName(String)
* employeeId(int)
* startDate(String)
* salary(int)

Write two constructors:

* non-argument constructor
* parameterized constructor that will initialize all instance variables

Create two different objects of the Employee class using both constructors
 and print the values of the properties inline using a print method.

Output:
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
 */

import JAVABatch15.class32.Class22.Employee;

//public class replit146
public class employee{
    String name;
    String lastName;
    int employeeId;
    String startsDate;
    int salary;

    public employee(){
        name=null;
        lastName=null;
        employeeId=0;
        startsDate=null;
        salary=0;
    }

    public employee(String name, String lastName, int employeeId, String startsDate, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.employeeId = employeeId;
        this.startsDate = startsDate;
        this.salary = salary;
    }

    public void display(){
        System.out.println(name+" "+lastName+" "+employeeId+" "+startsDate+" "+salary);
    }

    public static void main(String[] args) {
        Employee obj=new Employee();
       // Employee obj1=new Employee("Joe", "Smith", 12345,"01/01/1970"+ 35000);


    }

}
