package com.bridgelabz.companyemployeedetails;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyMain {
    static final String TCS = "TCS Company";
    static final String WIPRO = "WIPRO Company";

    public static void main(String[] args) {
        int userInput;
        Map <String,Company> companyBookMap = new HashMap<>();
//        Employee employee = new Employee();
        Company tcs = new Company();
        Company wipro = new Company();
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Enter 1 to Add Employee to TCS Company\n Enter 2 to Add Employee to Wipro\nEnter 0 to Exit ");
            userInput = scan.nextInt();
            switch (userInput){
                case 1:
                    tcs.addEmployee();
                    System.out.println(tcs.employeeList);
                    break;
                case 2:
                    wipro.addEmployee();
                    System.out.println(wipro.employeeList);
                default:
                    System.out.println("Exited from Program");
            }
        }
        while(userInput != 0);

        companyBookMap.put(TCS, tcs);
        companyBookMap.put(WIPRO, wipro);

        System.out.println(companyBookMap.toString());
    }
}
