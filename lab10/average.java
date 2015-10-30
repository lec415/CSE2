//Leonardo C Ramos
//10/30/2015
//CSE002 - Tenth Lab Assignment
//average program - builds an array of ints, and calculates the average
//
//
//
//
// first compile the program 
//     javac average.java
// run the program
//      java average

//import Scanner and Random class
import java.util.Scanner;


// define the class     
public class average{ 
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declaration of variables
        int sum=0;
        int average=0;
        int i=0;
        int[] array;
        
       
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.println("Enter the number of values are to be stored"); // 
        int n = myScanner.nextInt();// gets the integer
        array = new int[n]; //initialize the array
        for(i=0;i<n;i++){ // assigns random values to the array 
            array[i] = (int)(Math.random() * 100);
        }
        for(i=0;i<n;i++){ // prints all teh elements of the array 
            System.out.println("element "+(i+1)+ ": "+ array[i]);

        }
        for(i=0;i<n;i++){ // calculates the sum of the elements in the array
            sum += array[i];
        }
        average = sum/n; // calculates the average
        System.out.println("Average: "+average);// prints the average
        System.out.println("Values equal or greater are: ");
        for(i=0;i<n;i++){ // prints values of the array that are equal or greater than the average
            if(array[i] >= average){
                System.out.println(array[i]);
            }
        }
        
    

    } //end of main method
} //end of class