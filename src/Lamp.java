/*
 * Lamp.java
 * Author:  Yueqiao Chen 
 * Submission Date:   March 30th
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? The source code of Project 4, defining the lamp.
 * it only needs to store whether the lamp is lit or not.
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

public class Lamp {
	/*
	 * Instance variables and methods go here, you're responsible for 
	 * choosing and naming them.
	 */
	private boolean lampIsLit;
	// prevent any other class from accessing or modifying lampIsLit directly.
	public void setIsLit(boolean isLit) {
		// assign isLit to lampIsLit.
		lampIsLit=isLit;
	}

	public boolean getIsLit() {
		//return a boolean representing whether the light is lit.
		// if lamp is lit, getIsLit is true. Otherwise getIsLit is false.
		if (lampIsLit==true) {
			return true;
		} else {
			return false;
		}
	}
}