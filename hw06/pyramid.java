//Leonardo C Ramos
//10/06/2015
//CSE002 - Sixth Homework Assignment
//pyramid program - prints a pyramid given a size imputed by the user  
//
//
//
//
// first compile the program 
//     javac pyramid.java
// run the program
//      java pyramid

//import Scanner class
import java.util.Scanner;

//define the class
public class pyramid{
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declares variable
        int i =0;
        int j = 0;
        
        
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.print("Enter the size of the pyramid"); // asks for the user to enter the size of the pyramid
        int size = myScanner.nextInt();// gets the size of the pyramid
        
        for(i=0;i<size;i++){ //loop used to generate the pyramid
            for(j=0;j<size-i;j++){ //loop to make the make the pyramid align in the center
                System.out.print(" ");
            }
            for(j=0;j< (2*i+1);j++){ 
                System.out.print("*");// prints an element of the pyramid
            }// end of for loop
            System.out.println();// jumps to the next line
        }// end of for loop
           
    } //end of main method
} //end of class