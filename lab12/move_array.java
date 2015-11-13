//Leonardo C Ramos
//11/13/2015
//CSE002 - Twelfth Lab Assignment
//move_array program - moves the chosen element of the array to the end of the array
//
//
//
//
// first compile the program 
//     javac move_array.java
// run the program
//      move_array average

//import Scanner and Random class
import java.util.Scanner;


// define the class     
public class move_array{ 
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declaration of variables
        int temp=0;
        int i=0;
        int[] array;
        
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.println("Enter the size of the array"); //
        int n = myScanner.nextInt();// gets the size
        
        // checks to see if the size is greater than zero
        try {
            array = new int[n]; //initialize the array
            int aux1 = 2/n;
        } catch (NegativeArraySizeException e) {
            System.out.println("Invalid data");
            System.exit(0);
        }
         catch (ArithmeticException e) {
            System.out.println("Invalid data");
            System.exit(0);
        }
        array = new int[n]; //initialize the array
        
        for(i=0;i<n;i++){ // assigns random values to the array 
            array[i] = (int)(Math.random() * 100);
        }
        for(i=0;i<n;i++){ // prints all the elements of the array 
            System.out.println("element "+(i+1)+ ": "+ array[i]);

        }
        
        System.out.println("Enter the index of the element to be moved"); //
        int index = myScanner.nextInt();// gets the index of the element to be moved
        
        // checks to see if the index is valid
        try {
            int aux = array[index];
            } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid data");
            System.exit(0);
        } 
        
        //shifts the chosen element of the array to the last position
        temp = array[index];
        for(i=index;i<n-1;i++){ 
            array[i]=array[i+1];
        }
        array[n-1]=temp;
        
        for(i=0;i<n;i++){ // prints all teh elements of the array 
            System.out.println("element "+(i+1)+ ": "+ array[i]);

        }
        
    

    } //end of main method
} //end of class