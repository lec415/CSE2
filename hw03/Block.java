//CSE002
//Leonardo C Ramos
//14/09/15
//Third Homework Assignment @
//Block Java program
//This program calculates the volume and surface area of a cube
//
// first compile the program
//      javac Block.java
// run the program
//      java Block

//import the Scanner class
import java.util.Scanner;


//define the class
public class Block{
    
    //add main method
    public static void main (String[] args){
        
        //declare and construct new instance of Scanner
        Scanner myScanner = new Scanner(System.in);
        
        //declares variables to store the volume and area
        double blockVolume, blockSurface;
        
        // gets the information from the user
        System.out.print("Enter the length of the block: "); // asks for the user to input the lenght of the block
        double blockLength = myScanner.nextDouble(); // calls a method that Scanner objects have that allows us to get the input from the user
        System.out.print("Enter the width of the block: "); // asks for the user to input width of the block
        double blockWidth = myScanner.nextDouble(); // calls a method that Scanner objects have that allows us to get the input from the user
        System.out.print("Enter the height of the block: "); // asks for the user to input the height of the block
        double blockHeight = myScanner.nextDouble(); // calls a method that Scanner objects have that allows us to get the input from the user
        
        //calculates the volume and surface area of block
        blockVolume = blockWidth * blockLength * blockHeight; // calculates volume
        blockSurface = (2*blockWidth*blockLength) + (2*blockHeight*blockLength) + (2*blockHeight*blockWidth); // calculates surface area
        
        //prints the required values and information
        System.out.println("The volume of the block of dimensions " +blockLength+ " x "+blockWidth+" x "+blockHeight+ " is "+
        blockVolume); //prints volume of Block
        System.out.println("The surface area of the block is: " + blockSurface); //prints surface area of block
        
    }
}