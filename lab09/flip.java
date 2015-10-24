//Leonardo C Ramos
//10/23/2015
//CSE002 - Ninth Lab Assignment
//flip program -  calculates the result of n coin flips
//
//
//
//
// first compile the program 
//     javac flip.java
// run the program
//      java flip

//import Scanner and Random class
import java.util.Scanner;
import  java.util.Random;


//define the class
public class flip{
    
    public static void flip(int n) { // method to caculate result of a flip of a coin
        int i=0;
        int head=0;
        int tail =0;
        for(i=0;i<n;i++){
            int coinflip = flip();
            if (coinflip ==0){
                head++;
            }
             if (coinflip ==1){
                tail++;
            }
        }
        System.out.println("total of heads: "+ head); // prints the total of heads
        System.out.println("total of tail: "+ tail); // print the total of tails
    }
    
    public static int flip() { //  method to calculate result of n flips
        Random coin = new Random();
        int result = coin.nextInt(2);
        if(result == 0){
           System.out.println("head (0)") ;
        }
        else{
            System.out.println("tail (1)") ;
        }
        return result;
       
    }
    
    // define main method required for every Java program
    public static void main(String[] args) {
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.println("Enter an integer between 0 and 100"); //asks for a integer
        int input = myScanner.nextInt();// gets the integer
        if(input == 0){ // checks to see if is supposed to call method only once
            flip();
        }
        else if(input >100 ){ // condition to exit the program
            System.exit(0); //leaves the program
        }
        else { //call the method 
            flip(input);
        }
        
    } //end of main method
} //end of class