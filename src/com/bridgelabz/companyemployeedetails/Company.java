package com.bridgelabz.companyemployeedetails;
import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    ArrayList <Employee> employeeList = new ArrayList<>();
    void addEmployee(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee name -> ");
        String name = scan.next();
        System.out.println("Enter Employee Age -> ");
        int age = scan.nextInt();
        System.out.println("Enter Employee phone number -> ");
        long pNumber = scan.nextLong();
        System.out.println("Enter Employee city -> ");
        String city = scan.next();
        System.out.println("Enter Employee state -> ");
        String state = scan.next();
        System.out.println("Enter Employee department -> ");
        String dept = scan.next();

        Employee employeeDetails = new Employee();
        employeeDetails.setName(name);
        employeeDetails.setAge(age);
        employeeDetails.setPhoneNumber(pNumber);
        employeeDetails.setCity(city);
        employeeDetails.setState(state);
        employeeDetails.setDepartment(dept);

        employeeList.add(employeeDetails);
    }

    @Override
    public String toString() {
        return "Company{" +
                "employeeList=" + employeeList +
                '}';
    }
}
