//Leonardo C Ramos
//11/10/2015
//CSE002 - Tenth Homework Assignment
//MineSweeper program - builds a mine field and then sweeps it to find the mines, and prints the number of mines adjacent to each cell
//
//
//
//
// first compile the program 
//     javac MineSweeper.java
// run the program
//      java MineSweeper

//import Scanner and Random class
import java.util.Scanner;


//define the class
public class MineSweeper{

     
    // define main method required for every Java program
    public static void main(String[] args) {
        // gets the information from the user
        Scanner myScanner = new Scanner(System.in); // constructs a new instance of Scanner object and calls the Scanner constructor
        System.out.println("Enter the size of the board (between 2 and 30)"); // asks for the size of the board
        int N = myScanner.nextInt();// gets size
        int i=0;
        int j=0;
        int x=0;
        int y=0;
        char array[][] = new char[N][N];
        for(i=0;i<N;i++){ // initializes the mine field
            for(j=0;j<N;j++){
                array[i][j]  = '0';
            }
        }
        System.out.println("Enter the number of mines (between 1 and "+N*N+ ")"); // asks for the number of mines
        int M = myScanner.nextInt();// gets the number of mines
        
        for(i=0;i<M;i++){ // places the mines in random locations
            x = (int)(Math.random()*N-1);
            y = (int)(Math.random()*N-1);
            if(array[x][y]!='M'){
                array[x][y] = 'M';
            }
    
        }
        for(i=0;i<N;i++){ // sweeeps the mines and find the number of mines adjacent to each cell
            for(j=0;j<N;j++){
                if(array[i][j]  == 'M'){
                        
                        if(i==0 && j==0){
                           if(array[i+1][j+1]!='M'){
                               array[i+1][j+1] +=1;
                           } 
                           if(array[i+1][j]!='M'){
                               array[i+1][j] +=1;
                           }
                           if(array[i][j+1]!='M'){
                               array[i][j+1] +=1;
                           }
                        }
                        else if(i==N && j==0){
                            if(array[i-1][j+1]!='M'){
                               array[i-1][j+1] +=1;
                           } 
                           if(array[i-1][j]!='M'){
                               array[i-1][j] +=1;
                           }
                           if(array[i][j+1]!='M'){
                               array[i][j+1] +=1;
                           }
                        }
                        else if(i==0 && j==N){
                            if(array[i+1][j-1]!='M'){
                               array[i+1][j-1] +=1;
                           } 
                           if(array[i+1][j]!='M'){
                               array[i+1][j] +=1;
                           }
                           if(array[i][j-1]!='M'){
                               array[i][j-1] +=1;
                           }
                        }
                        else if(i==N && j==N){
                            if(array[i-1][j-1]!='M'){
                               array[i-1][j-1] +=1;
                           } 
                           if(array[i-1][j]!='M'){
                               array[i-1][j] +=1;
                           }
                           if(array[i][j-1]!='M'){
                               array[i][j-1] +=1;
                           }
                        }
                        else if(i==0){
                           if(array[i+1][j+1]!='M'){
                               array[i+1][j+1] +=1;
                           } 
                           if( array[i+1][j]!='M'){
                                array[i+1][j] +=1;
                           }
                           if(array[i][j+1]!='M'){
                               array[i][j+1] +=1;
                           }
                           if(array[i+1][j-1]!='M'){
                               array[i+1][j-1] +=1;
                           } 
                           if(array[i][j-1]!='M'){
                               array[i][j-1]+=1;
                           }
                          
                        }
                        else if(i==N){
                            if(array[i-1][j-1]!='M'){
                               array[i-1][j-1] +=1;
                           } 
                           if(array[i-1][j]!='M'){
                               array[i-1][j] +=1;
                           }
                           if(array[i][j-1]!='M'){
                               array[i][j-1] +=1;
                           }
                           if(array[i-1][j+1]!='M'){
                               array[i-1][j+1] +=1;
                           } 
                           if(array[i][j+1]!='M'){
                               array[i][j+1] +=1;
                           }
                        }
                        else if(j==0){
                            if(array[i+1][j+1]!='M'){
                               array[i+1][j+1] +=1;
                           } 
                           if(array[i][j+1]!='M'){
                               array[i][j+1] +=1;
                           }
                           if(array[i-1][j]!='M'){
                               array[i-1][j] +=1;
                           }
                           if(array[i+1][j]!='M'){
                               array[i+1][j] +=1;
                           } 
                           if(array[i-1][j+1]!='M'){
                               array[i-1][j+1] +=1;
                           }
                        }
                        else if(j==N){
                            if(array[i-1][j-1]!='M'){
                               array[i-1][j-1] +=1;
                           } 
                           if(array[i][j-1]!='M'){
                               array[i][j-1] +=1;
                           }
                           if(array[i+1][j]!='M'){
                               array[i+1][j] +=1;
                           }
                           if(array[i-1][j]!='M'){
                               array[i-1][j] +=1;
                           } 
                           if(array[i-1][j-1]!='M'){
                               array[i-1][j-1] +=1;
                           }
                        }
                        else{
                           if(array[i+1][j+1]!='M'){
                               array[i+1][j+1] +=1;
                           } 
                           if(array[i+1][j-1]!='M'){
                               array[i+1][j-1] +=1;
                           }
                           if(array[i-1][j+1]!='M'){
                               array[i-1][j+1] +=1;
                           }
                           if(array[i-1][j-1]!='M'){
                               array[i-1][j-1] +=1;
                           } 
                           if(array[i][j+1]!='M'){
                               array[i][j+1] +=1;
                           } 
                           if(array[i][j-1]!='M'){
                               array[i][j-1] +=1;
                           }
                           if(array[i+1][j]!='M'){
                               array[i+1][j] +=1;
                           }
                           if(array[i-1][j]!='M'){
                               array[i-1][j] +=1;
                           }
    
                        }
                }
            }
        }
        
        
        
        for(i=0;i<N;i++){ // print the mines
            for(j=0;j<N;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
        
    

    } //end of main method
} //end of class