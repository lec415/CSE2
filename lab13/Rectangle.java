//Leonardo C Ramos
//11/20/2015
//CSE002 - Thirteenth Lab Assignment
//Rectangle program - uses non static methods to calculate the area of a rectangle
//
//
//
//
// first compile the program 
//     javac Rectangle.java
// run the program
//      java Rectangle

//import Scanner and Random class
import java.util.Scanner;


// define the class     
public class Rectangle{ 
    double width=0;
    double heigth=0;
     
     
    //define the non static class to set the Width
    public void setWidth(double x){
        width = x;
    }
    
    //define the non static class to set the Heigth
    public void setHeigth(double x){
        heigth = x;
    }
    
    //define the non static class to calculate the Area
    public double getArea(){
        return heigth*width;
    }
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declaration of new variable of the type Rectangle
        Rectangle r1 = new Rectangle();
        r1.setHeigth(5.0);
        r1.setWidth(7.0);
        
        //print the result
        System.out.println(r1.getArea());

    } //end of main method
} //end of class