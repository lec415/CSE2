//CSE002
//Leonardo C Ramos
//14/09/15
//Third Homework Assignment @
//Timer Java program
//This program calculates time remaining until dinner
//
// first compile the program
//      javac Timer.java
// run the program
//      java Timer

//import the Scanner class
import java.util.Scanner;


//define the class
public class Timer{
    
    //add main method
    public static void main (String[] args){
        
        //declare and construct new instance of Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //declare varibles
        int hoursToDinner, minToDinner;
        int minuteDinnerFraction, minuteCurrentFraction;
        float dinnerFraction, currentFraction;
        
        // gets the information from the user
        System.out.print("Enter the current time: "); // asks for the user to input the current time
        int currentTime = myScanner.nextInt(); // calls a method that Scanner objects have that allows us to get the input from the user
        System.out.print("Enter the time that you will be eating dinner: "); // asks for the user to input the time he is going to eat dinner
        int dinnerTime = myScanner.nextInt(); // calls a method that Scanner objects have that allows us to get the input from the user
        
       
        //gets the minutes from the current time and dinner time using the remainder operator
        minuteDinnerFraction = dinnerTime%100;
        minuteCurrentFraction = currentTime%100;
        
        //calculates the hours remaining until they eat dinner
        hoursToDinner = (dinnerTime/100) - (currentTime/100);
        
        //checks the relation between the minutes and calculates them minutes remaining until dinner accordingly
        if(minuteCurrentFraction > minuteDinnerFraction){
            minToDinner = 60 + minuteDinnerFraction-minuteCurrentFraction;
            hoursToDinner--; // updates the hours remaning if necessary
        }
        else{
            minToDinner = minuteDinnerFraction-minuteCurrentFraction;
        }
        
        //prints the required values and information
        System.out.println("You have " + hoursToDinner+ " hours and "+minToDinner  + " minutes until dinner"); //prints the item name
    }
}