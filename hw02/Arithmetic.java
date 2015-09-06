//CSE002
//Leonardo C Ramos
//04/09/15
//Second Homework Assignment @
//Arithmetic Java program
//This program calculates the cost of the items bought, including the 6% tax
//
// first compile the program
//      javac Arithmetic.java
// run the program
//      java Arithmetic


//define the class
public class Arithmetic{
    
    //add main method
    public static void main (String[] args){
        
        //variable declaration
        int nSocks = 3; //number of pair of socks
        double sockCost$ = 2.58; //cost per pair of socks
        
        int nGlasses = 6; //number of drinking glasses
        double glassCost$ = 2.29; //cost per glass
        
        int nEnvelopes = 1; //number of boxes of envelopes
        double envelopeCost$ = 3.25; //cost per box of envelopes
        double taxPercent = 0.06; //tax percentage
        
        double totalEnvelopeCost$, totalSockCost$, totalGlassCost$, totalCost$; //variables for the total costs
        double envelopeTax, sockTax, glassTax, totalTax; //variables for the taxes
        
        //calculates the total cost per item
        totalEnvelopeCost$ = nEnvelopes*envelopeCost$; //total cost of the envelopes
        totalSockCost$ = nSocks*sockCost$; //total cost of the socks
        totalGlassCost$ = nGlasses*glassCost$; //total cost of the glasses
        
        //calculates the total tax per item
        envelopeTax = totalEnvelopeCost$*taxPercent; //total tax of the envelopes
        sockTax = totalSockCost$*taxPercent; //total tax of the socks
        glassTax = totalGlassCost$*taxPercent; //total tax of the glasses
        
        //calculates the total cost of the purchase and the total tax
        totalCost$ = totalGlassCost$+totalSockCost$+totalEnvelopeCost$; //total cost of the purchase
        totalTax = totalCost$*taxPercent; //total tax 
        
        //prints the required values and information
        System.out.println("Item:          Envelope      Socks       Glass"); //prints the item name
        System.out.println("Quantity:          " + nEnvelopes+"           "+ nSocks+"           "+nGlasses); //prints the quantity of each item 
        System.out.println("Cost per Item:   "+envelopeCost$ +"         "+sockCost$+"         "+glassCost$); //prints the cost per item
        System.out.println("---------------------------------------------------");
        System.out.println("Total per Item:  "+totalEnvelopeCost$ +"         "+totalSockCost$+"         "+totalGlassCost$); //prints the total cost per item
        System.out.println("Tax per Item:    "+envelopeTax +"       "+sockTax+"       "+glassTax); //prints the total tax per item
        System.out.println("---------------------------------------------------");
        System.out.println("---------------------------------------------------");
        System.out.println("Total (no tax):               "   +totalCost$); //prints the total cost of the purchase (without taxes)
        System.out.println("Total Tax:                    "+totalTax); //prints the total tax value
        System.out.println("Total (with tax):             "   +(totalCost$+totalTax)); //prints the total cost of the purchase (with taxes)
        
    }
}