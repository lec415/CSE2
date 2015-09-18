//Leonardo C Ramos
//09/11/2015
//CSE002 - LAB 04
//Calculator program - calculates the value of a operation chosen by the user, 
//given two intergers.
//
//
//
// first compile the program 
//     javac Calculator.java
// run the program
//      java Calculator

//import Scanner class
import java.util.Scanner;

//define the class
public class Calculator{
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declares variable
        float result = 0; //declares the result variable
        
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.print("Enter the value of integer A: "); // asks for the user to input the value of integer A
        int a = myScanner.nextInt(); // gets the value of the integer A
        System.out.print("Enter the value of integer B: "); // asks for the user to input the value of integer B
        int b = myScanner.nextInt(); // gets the value of the integer B
        System.out.print("Enter the operation you wish to do: "); // asks for the user to input the desired operation
        String operation = myScanner.next(); // gets the desired operation
        
        // tests the operator tha was chosen, and makes the respective operation
        switch(operation){
            case "+": result = a+b; // if the user input was a '+' it adds A and B
                       break;        
            case "-": result = a-b; // if the user input was a '-' it subtracts A and B
                       break;
            case "*": result = a*b; // if the user input was a '*' it multiplies A and B
                       break;           
            case "/": result = (float)a/b; // if the user input was a '/' it divides A and B
                       break;    
            default: System.out.println("Invalid Operator"); // defaut case. If user inputs and invalid operator, a message will appear
                       break;           
        }
        
        System.out.println("The result is: " + result); //prints the result of the operation 
        
        
    } //end of main method
} //end of class