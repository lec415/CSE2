//Leonardo C Ramos
//09/04/2015
//CSE002 - LAB 02
//Cyclometer program - For two trips, given time and rotation, this program 
//prints the number of minutes, counts, and distance for each trip, and also the 
//total combined distance.
//
// first compile the program
//      Cyclometer.java
// run the program
//      java Cyclometer


//define the class
public class Cyclometer{

    //define the main method
    public static void main(String[] args){
        
            //our input variables
        int secsTrip1 = 480; // time(in seconds) of the first trip
        int secsTrip2 = 3220; // time(in seconds) of the seconds trip
        int countsTrip1 = 1561; // roatation count for the first trip
        int countsTrip2 = 9037; // rotation count for the first trip
        
            //our intermediate variables and output data
        double wheelDiameter = 27.0 ;  // diameter of the wheel
        double PI = 3.14159;  //  value of PI
        double feetPerMile = 5280;  // number of feet in a mile
        double inchesPerFoot = 12;  //  number of inches in a foot
        double secondsPerMinute = 60;  // number of seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance;  // variables to store the distances
        
            //prints the information of the trips
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+
        " minutes and had "+countsTrip1+" counts."); //prints information of trip 1
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
        " minutes and had "+countsTrip2+" counts."); //prints information of trip 2
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //Above gives distance in inches
        //(for each count, a rotation of the wheel travels 
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; // gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // gives distance in miles
        totalDistance=distanceTrip1+distanceTrip2; // gives distance in miles
        
        
            //print out the output data
        System.out.println("Trip 1 was "+distanceTrip1+"miles"); //prints the distance of trip 1
        System.out.println("Trip 2 was "+distanceTrip2+"miles"); //prints the distance of trip 2
        System.out.println("The total distance was "+totalDistance+" miles"); //prints the total distance
        
    }   //end of main method
}   //end of class
