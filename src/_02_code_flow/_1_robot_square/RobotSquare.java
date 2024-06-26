package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
	
    public static void main(String[] args){
    	// COUNT. Create an int variable that will count how many sides of the square we have drawn.
    	//        The start value will be zero because no sides have yet been drawn. Use this code:
		int count = 0;    
		    // This code makes a new Robot
	    Robot Erik = new Robot();

    	while ( count < 4 ) { 
     	
        // PEN.  Put the robot's pen down so it can draw, Use this command:
		     Erik.penDown();    

        // SPEED. Make the robot move quickly. Use this command:
		     Erik.setSpeed(7);    
 
        // DRAW.  Draw a line. Use this command:
    		 Erik.move(-100);  
  
    	// TURN.  Turn 90 degrees. Use this command:
    		 Erik.turn(90);   
        // INCREASE COUNT. Add one to the number of sides that have now been drawn like this:
    		 count += 1 ; 

    	}
    	// Run the program. Did the Robot draw a line and turn?
    	 
    	
        // LOOP.  Make a while loop and move the DRAW, TURN, and INCREASE COUNT code 
    	//        so it is between the curly braces like the example below. 
    	//        The code in the loop will now repeat 4 times to draw a square.
    	
    	    
    	 
    	
    	
    	// Run the program again. Did your Robot draw a square?


    }
}
