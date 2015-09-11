//Leonardo C Ramos
//09/11/2015
//CSE002 - LAB 03
//Check program - This program splits the check (with tax) between the number
//of people that are having dinner. It takes three inputs from the user:  the 
//total cost of the check. the tip percentage, and the number of people.
//
// first compile the program
//     javac Check.java
// run the program
//      java Check

//import Scanner class
import java.util.Scanner;

//define the class
public class Check{
    
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.print("Enter the original cost of the check in the form xx.xx: "); // asks for the user to input the original cost of the check
        double checkCost = myScanner.nextDouble(); // calls a method that Scanner objects have that allows us to get the input from the user
        System.out.print("ENter the percentage tip that you wish to pay as a whole number (in the form xx): "); // asks for the user to input the percentage tip they wish to pay
        double tipPercent = myScanner.nextDouble(); // calls a method that Scanner objects have that allows us to get the input from the user
        tipPercent /= 100; //We want to convert the percentage into a decimal value
        System.out.print("Enter the number os people who went out to dinner: "); // asks for the user to input the number of people that are spliting the check
        int numPeople = myScanner.nextInt(); // calls a method that Scanner objects have that allows us to get the input from the user
        
        //declares variables
        double totalCost;
        double costPerPerson;
        int dollars, dimes, pennies;
        
        //calculates the amount that each person should pay
        totalCost = checkCost * (1+ tipPercent); 
        costPerPerson = totalCost / numPeople;
        
        
        dollars = (int)costPerPerson; //get the whole amout, dropping decimal fraction
        
        
        //get dimes amount, e.g.,
        //(int) (6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the ramainder
        //after the division: 583%100 -> 83, 27%5 -> 2
        dimes = (int) (costPerPerson * 10) % 10;
        pennies = (int) (costPerPerson * 100) % 10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies); //prints the amount each person should pay 
        
        
    } //end of main method
} //end of class