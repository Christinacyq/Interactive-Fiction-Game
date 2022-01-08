/*
 * Player.java
 * Author:  Yueqiao Chen 
 * Submission Date:  March 30th
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? The source code of Project 4, defining the player.
 * A player object will represent the user playing the game, and thus needs to store 
 * which map square they are currently on (integer x and y coordinates), the lamp and key. 
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing 
 * or posting of source code for this assignment is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia.  
 */

public class Player {
	private int x;
	private int y;
	private Lamp theLamp;
	private Key theKey;
	// prevent any other class from accessing or modifying these variables directly.
	public void setX(int xValue) {
		// assign xValue to x.
		x=xValue;
	}
	public void setY(int yValue) {
		// assign yValue to y.
		y=yValue;
	}
	public int getX() {
		// return an integer representing the x coordinate.
		return x;
	}
	public int getY() {
		// return an integer representing the y coordinate.
		return y;
	}
	public Lamp getLamp() {
		// return a Lamp representing whether the lamp exist.
		return theLamp;
	}
	public Key getKey() {
		// return a Key representing whether the key exist.
		return theKey;
	}
	public void setLamp(Lamp lamp) {
		// assign lamp value to theLamp.
		theLamp=lamp;
	}
	public void setKey(Key key) {
		// assign key value to theKey.
		theKey=key;
	}

}
