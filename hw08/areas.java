//Leonardo C Ramos
//10/27/2015
//CSE002 - Eight Homework Assignment
//areas program -  Calculates area of geometric shape chosen by user
//
//
//
//
// first compile the program 
//     javac areas.java
// run the program
//      java areas

//import Scanner and Random class
import java.util.Scanner;


//define the class
public class areas{
    
    public static double area(int r) { // method to caculate the area of a circle
        double pi = 3.1415;
        double result = 0;
        result = 2*pi*r;
        return result;
    }
    
    public static double area(int w, int l) { // method to caculate the area of a rectangle
        double result =0;
        result = w*l;
        return result;
    }
    
    public static double area(int b1, int b2, int h) { // method to caculate the area of a trapezoid
        double result =0;
        result = (b1+b2)*h/2;
        return result;
    }
       
    
    
    // define main method required for every Java program
    public static void main(String[] args) {
        double res=0;
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.println("Enter '0' to exit the program"); // 
        System.out.println("Enter a number to choose the geometric shape (1 = circle, 2 = rectangle, 3 = trapezoid:  "); //asks for a shape
        int input = myScanner.nextInt();// gets the integer
        if (input == 0){
                 System.exit(0); //leaves the program
            }
        while (input != 1 && input != 2 && input != 3){
            System.out.println("Enter a number to choose the geometric shape (1 = circle, 2 = rectangle, 3 = trapezoid:  "); //asks for a shape
            input = myScanner.nextInt();// gets the integer
            if(input == 0){ // checks to see the if user wants to exit the program
            System.exit(0); //leaves the program
        }
        }
        if (input ==1){
            System.out.println("Enter the radius of the circle"); //asks radius of circle
            int radius = myScanner.nextInt(); // gets the radius
            res = area(radius);
        }
         if (input ==2){
            System.out.println("Enter the width of the rectangle"); //asks for width of rectangle
            int width = myScanner.nextInt();// gets the width
            System.out.println("Enter the length of the rectangle"); //asks for length of rectangle
            int length = myScanner.nextInt();// gets the length
            res = area(width, length);
        }
         if (input ==3){ 
            System.out.println("Enter the base 1 of the trapezoid"); //asks for base 1 of trapezoid
            int base1 = myScanner.nextInt();// gets the base1
            System.out.println("Enter the base 2 of the trapezoid"); //asks for base 2 of trapezoid
            int base2 = myScanner.nextInt();// gets the base2
            System.out.println("Enter the heigth of the trapezoid"); //asks for heigth of trapezoid
            int heigth = myScanner.nextInt();// gets the heigth
            res = area(base1, base2, heigth);
        }
        
        
        System.out.println("area: " + res);// prints the result 
    

    } //end of main method
} //end of class