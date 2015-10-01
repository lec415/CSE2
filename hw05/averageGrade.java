//Leonardo C Ramos
//10/01/2015
//CSE002 - Fifth Homework Assignment 
//averageGrade program - calculates the average of all the valid grades entered 
//
//
//
//
// first compile the program 
//     javac averageGrade.java
// run the program
//      java averageGrade

//import Scanner class
import java.util.Scanner;

//define the class
public class averageGrade{
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declares variable
        float total = 0; //declares the total variable
        int count = 0; //declares the auxiliar variable to count the number of valid grades entered
        
        
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.print("Enter a valid grade or enter 999 to exit "); // asks for the user if he wants to stop the program, or to enter a grade otherwise
        int grade = myScanner.nextInt();// gets the grade typed by the user
        
        while(grade != 999){ //checks if the user wants to quit the program. If not, it will continue doing whats inside the loop
            if(grade < 0 || grade > 100){ //checks if the grade entered is valid
                System.out.print("Grade not valid. "); // tells the user the grade entered is not valid
            }
            else{ //executes if the grade is valid
                count ++; //stores the number of valid grades entered
                total = total + grade; //stores the total sum of all the valid grade entered
            }
            System.out.print("Enter a valid grade or enter 999 to exit "); // asks for the user if he wants to stop the program, or to enter a grade otherwise
            grade= myScanner.nextInt(); //gets grade typed by the user
            
        } //end of while loop
        
        System.out.println("The average of the grades is: " + (total/count)); //prints the average of grades
        
    } //end of main method
} //end of class