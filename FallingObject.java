/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fallingobject;

/** This program will compute the distance of an object falling under earth's gravity. 
 * The formula is: 0.5 x at^2 + iV + iP = d
 * a is acceleration, -9.8 m/s^2. t is time, 15 seconds. iV is initial velocity, 0.
 * iP is initial position, 0. d is distance traveled, which is what we are computing for.
 * To start of the program we will declare and initialize 5 variables for the storage
 * of acceleration, time, initial velocity, initial position, and distance traveled.
 * All the data types of the variables will be double since the product will include a decimal.
 * Lastly we will print the outcome to the console. 
 *
 * @author sstev
 */
public class FallingObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double a = -9.8; // acceleration is -9.8 m/s^2
        double t = 15; // time is at 15 seconds
        double iV = 0; // iV is initial velocity which is at 0
        double iP = 0; // iP is initial position which is at 0
        double d = 0;  // d is the total distance traveled which will be computed.
        
        d = 0.5 * (a)*(t*t)+iV * t +iP; // formula to find distance traveled
        
        // Statement printing distance traveled out to console
        System.out.print("The total distance traveled is: " + d + " meters ");
        // TODO code application logic here
    }
    
}
