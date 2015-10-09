//Leonardo C Ramos
//10/09/2015
//CSE002 - Seventh Lab Assignment
//encrypted_x program - prints an encrypted X message  
//
//
//
//
// first compile the program 
//     javac encrypted_x.java
// run the program
//      java encrypted_x

//import Scanner class
import java.util.Scanner;

//define the class
public class encrypted_x{
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declares variable
        int i =0;
        int j = 0;
        
        
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.print("Enter the size of the encrypted message: "); // asks for the user to enter the size of the encrypted message
        int input = myScanner.nextInt();// gets the size of the pyramid
        if(input<0 || input>100){ //checks if input is within the acceptable range
            System.exit(-1); // ends program if it is not
        }
        for(i=1;i<input;i++){ //loop used to generate encrypted message
            for(j=1;j<input;j++){ //loop used to print each line
                if(j == i || j == input-i){ //checks if the output sould be a blank space or not
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println(); // jumps to the next line
        }// end of for loop
           
    } //end of main method
} //end of class