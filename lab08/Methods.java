//Leonardo C Ramos
//10/16/2015
//CSE002 - Eighth Lab Assignment
//Methods program - Calculates de Mean Value and the Median of a data set  
//
//
//
//
// first compile the program 
//     javac Methods.java
// run the program
//      java Methods

//import Scanner class
import java.util.Scanner;


//define the class
public class Methods{
    
    public static double mean(double total) { // method to caculate the mean value. Returns a double
        return total/10;
    }
    
    public static double median(double a, double b) { //  method to calculate the median. Returns a double
        return (a+b)/2;
    }
    
    public static void result(double mean, double median) { // method to print the results. It is a void method
        System.out.println("Mean value: "+ mean + "Median: "+ median);
    }
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declares variable
        int i =0;
        double a = 0;
        double b = 0;
        double total = 0;
        
        
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.println("Enter 10 elements for the data"); //asks for a data set of 10 elements
        for(i=0;i<10;i++){ // loop to get all the data
            System.out.println("Enter the element "+ (i+1) +" of the data"); // asks for the user to enter the i-th data element
            double input = myScanner.nextDouble();// gets the current data value
            total += input; // computes the sum of all the data elements
            if(i == 4){ // checks to see if the calue is in the middle of the data set
                a = input;
            } 
            if(i == 5){ // checks to see if the calue is in the middle of the data set
                b = input;
            }
        }
        double setMean = mean(total); // calls a method to calculate de mean value and stores the result on a variable
        double setMedian = median(a, b); // calls a method to calculate de median and stores the result on a variable
        result(setMean, setMedian); // calls a method to print the results
        
    } //end of main method
} //end of class