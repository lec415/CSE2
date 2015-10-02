//Leonardo C Ramos
//10/02/2015
//CSE002 - Lab 06 
//timeSheets program - the total weekly payroll given the number of employees, their pay per hour, and the number of hours worked  
//
//
//
//
// first compile the program 
//     javac timeSheets.java
// run the program
//      java timeSheets

//import Scanner class
import java.util.Scanner;

//define the class
public class timeSheets{
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declares variable
        int totalHours = 0; //declares the total variable
        int totalPayroll = 0;
        int employeePayroll = 0;
        int i =0;
        int j = 0;
        
        
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.print("Enter the number (non-negative) of employee timesheets to be read in "); // asks for the user to enter the number of employees
        int employeeNumber = myScanner.nextInt();// gets the number of employees
        
        for(i=0;i<employeeNumber;i++){ //loop used to calculate the total payroll
            int payPerHour = myScanner.nextInt();// gets the pay per Hour of the each employee
            for(j=0;j<5;j++){ // loop used to calculate the total hours worked by each employee
                System.out.println("Enter hours worked by employee " +(i+1) + " on day " + (j+1));// asks for the number of hours worked
                int hoursWorked = myScanner.nextInt();// gets hours worked by each employee
                totalHours = totalHours + hoursWorked; //calculates the total amount of hours worked by each employee
            }// end of for loop
            employeePayroll = totalHours*payPerHour; //calculates the total payroll of each employee
            totalPayroll = totalPayroll + employeePayroll; //calculates the total payroll of all employees
            totalHours = 0; //resets the total hours variable so it can be used to calculate for the next employee
        }// end of for loop
           
        
        System.out.println("The total payroll is: " + totalPayroll); //prints total payroll
        
    } //end of main method
} //end of class