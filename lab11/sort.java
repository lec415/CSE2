//Leonardo C Ramos
//11/06/2015
//CSE002 - Eleventh Lab Assignment
//sort program - take an array of integers and sort the elements of the array in ascending order
//
//
//
//
// first compile the program 
//     javac sort.java
// run the program
//      java sort

//import Scanner and Random class
import java.util.Scanner;



// define the class     
public class sort{ 

    public static void sort(int[] v) { // method to sort the elements
    //declares variables
    int j=0;
    int i=0;
    int count=0;
    int lastcount=0;
    int[] auxArray;
    auxArray = new int[v.length];
    
    for(j=0;j<100;j++){ //checks to see if the is elements from 1 to 100
        for(i=0;i<v.length;i++){ // counts how many of each element there is
            if(v[i]==j){
                count++;
            }
        }
        if(count!=0){
            for(i=0;i<count;i++){ // builds sorted array
                auxArray[lastcount+i]=j;
            
            }
            lastcount=lastcount + count;
            count=0;
        }
        
    }
    
    // prints sorted elements
    System.out.println("Sorted elements of Array");
    for(j=0;j<v.length;j++){ 
        System.out.print(" " + auxArray[j]);
    }
    System.out.println();
}   
    // define main method required for every Java program
    public static void main(String[] args) {
        
        // declaration of variables
        int i=0;
        int[] array20;
        int[] array10;
        int[] array30;
        
        array20 = new int[20];//initialize the array
        array10 = new int[10];//initialize the array
        array30 = new int[30];//initialize the array
        
        for(i=0;i<20;i++){ // assigns random values to the array 
            array20[i] = (int)(Math.random() * 100);
        }
        
        // prints elements of array 1
        System.out.println("Elements of Array 1");
        for(i=0;i<20;i++){ 
            System.out.print(" "+array20[i]);
        }
        System.out.println();
        
        sort(array20); // call  the method to sort array 1
        
        for(i=0;i<10;i++){ // assigns random values to the array 
            array10[i] = (int)(Math.random() * 100);
        }
        System.out.println();
        
        // prints elements of array 2
        System.out.println("Elements of Array 2");
        for(i=0;i<10;i++){ 
            System.out.print(" "+array10[i]);
        }
        System.out.println();
        
        sort(array10); // call method to sort array 2
        
        // builds the last array wiht the elements of previous arrays
        for(i=0;i<20;i++){
            array30[i] = array20[i];
        }
        for(i=0;i<10;i++){
            array30[20+i] = array10[i];
        }
        System.out.println();
        
        sort(array30); // call method to sort array 3

    } //end of main method
} //end of class