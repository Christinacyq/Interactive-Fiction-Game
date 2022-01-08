/*
 * Adventure.java
 * Author:  Yueqiao Chen 
 * Submission Date:  March 30th
 *
 * Purpose: A brief paragraph description of the
 * program. What does it do? The source code of Project 4 that run the game.
 *The idea in the Adventure class is that you loop repeatedly 
 *until the player dies (attacked by grue) or finds the treasure (opens chest). 
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

import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		System.out.println("Welcome to UGA Adventures: Episode I\n" + 
				"The Adventure of the Cave of Redundancy Adventure\nBy: Yueqiao Chen\n");
		Scanner keyboard= new Scanner(System.in); 
		int x=0; // represent the x coordinate
		int y=0; // represent the y coordinate
		boolean eatenByAGrue=false; // represent whether the player dies (attacked by grue)
		Player player=new Player(); // create a Player object
		player.setX(x);
		player.setY(y); 
		// set the starting coordinates to (0,0).
		Map map=new Map(); // create a new Map object.
		Room playersRoom = map.getRoom(player.getX(), player.getY()); // get the Room object from the map.
		System.out.println(playersRoom.getDescription()); // print the corresponding description of the room.
		do {
			String command=keyboard.nextLine();  // read the command from user
			//EAST
			if (command.equalsIgnoreCase("east")) {	
				// check the current room object to see if the given direction is valid
				if (playersRoom.canGoEast()) {
					// If the current room (prior to the move) isDark(), AND the player doesn't have the lamp OR they have the lamp but the lamp is not lit, the player is eaten by a grue and the game is over.
					if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
						System.out.println("You have stumbled into a passing grue, and have been eaten");
						eatenByAGrue=true;
					} else {
						y++; //move the user East one square (+1 y)
						player.setY(y);	// update the player's position
						playersRoom = map.getRoom(player.getX(), player.getY()); //move into a new room
						if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
							System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
							//If the room (after the move) isDark() AND the player does not have the lamp OR the lamp is not lit, then instead of printing the description, tell them: “It is pitch black, you can't see anything. You may be eaten by a grue!”.
						} else {
							System.out.println(playersRoom.getDescription()); //print out its description, so the user doesn't have to type LOOK every time
						}
					}
				} else {
					System.out.println("Can't go that way");
				}
			}
			//WEST
			else if (command.equalsIgnoreCase("west")) {	
				// check the current room object to see if the given direction is valid
				if (playersRoom.canGoWest()) {
					// If the current room (prior to the move) isDark(), AND the player doesn't have the lamp OR they have the lamp but the lamp is not lit, the player is eaten by a grue and the game is over.
					if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
						System.out.println("You have stumbled into a passing grue, and have been eaten");
						eatenByAGrue=true;
					} else {
						y--; //move the user West one square (-1 y)
						player.setY(y); // update the player's position
						playersRoom = map.getRoom(player.getX(), player.getY()); //move into a new room
						if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
							System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
							//If the room (after the move) isDark() AND the player does not have the lamp OR the lamp is not lit, then instead of printing the description, tell them: “It is pitch black, you can't see anything. You may be eaten by a grue!”.
						} else {
							System.out.println(playersRoom.getDescription()); //print out its description, so the user doesn't have to type LOOK every time
						}
					}
				} else {
					System.out.println("Can't go that way");
				}
			}
			//NORTH
			else if (command.equalsIgnoreCase("north")) {
				// check the current room object to see if the given direction is valid
				if (playersRoom.canGoNorth()) {
					// If the current room (prior to the move) isDark(), AND the player doesn't have the lamp OR they have the lamp but the lamp is not lit, the player is eaten by a grue and the game is over.
					if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
						System.out.println("You have stumbled into a passing grue, and have been eaten");
						eatenByAGrue=true;
					} else {
						x--; //move the user North one square (-1 x)
						player.setX(x); // update the player's position
						playersRoom = map.getRoom(player.getX(), player.getY()); //move into a new room					
						if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
							System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
							//If the room (after the move) isDark() AND the player does not have the lamp OR the lamp is not lit, then instead of printing the description, tell them: “It is pitch black, you can't see anything. You may be eaten by a grue!”.
						} else {
							System.out.println(playersRoom.getDescription()); //print out its description, so the user doesn't have to type LOOK every time
						}
					}
				} else {
					System.out.println("Can't go that way");
				}
			}
			//SOUTH
			else if (command.equalsIgnoreCase("south")) {	
				// check the current room object to see if the given direction is valid
				if (playersRoom.canGoSouth()) {
					// If the current room (prior to the move) isDark(), AND the player doesn't have the lamp OR they have the lamp but the lamp is not lit, the player is eaten by a grue and the game is over.
					if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
						System.out.println("You have stumbled into a passing grue, and have been eaten");
						eatenByAGrue=true;
					} else {
						x++; //move the user South one square (+1 x)
						player.setX(x); // update the player's position
						playersRoom = map.getRoom(player.getX(), player.getY());  //move into a new room
						if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
							System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
							//If the room (after the move) isDark() AND the player does not have the lamp OR the lamp is not lit, then instead of printing the description, tell them: “It is pitch black, you can't see anything. You may be eaten by a grue!”.
						} else {
							System.out.println(playersRoom.getDescription()); //print out its description, so the user doesn't have to type LOOK every time
						}
					}
				} else {
					System.out.println("Can't go that way");
				}
			}
			// GET LAMP
			else if (command.equalsIgnoreCase("get lamp")){
				//Print “OK” if there is a lamp in the room, or “No lamp present” if not.
				if (playersRoom.getLamp()!=null) { // getLamp() allows you to check whether the lamp exist
					player.setLamp(playersRoom.getLamp()); // transfers the lamp from the room to the player.
					playersRoom.clearLamp(); //clear the lamp from the room
					System.out.println("OK"); 
				} else {
					System.out.println("No lamp present");
				}
			} 
			// LIGHT LAMP
			else if (command.equalsIgnoreCase("light lamp")) {
				if (player.getLamp()==null) { 	
					System.out.println("You don't have the lamp to light");
					// if the player doesn't have the lamp, print "You don't have the lamp to light"
				} else {
					player.getLamp().setIsLit(true); // If the player has the lamp, this sets it to lit.
					System.out.println("OK"); // Print “OK” if the player has the lamp
				}
			}
			// LOOK
			else if (command.equalsIgnoreCase("look")) {
				if ((playersRoom.isDark())&&((player.getLamp()==null)||(!player.getLamp().getIsLit()))) {
					System.out.println("It is pitch black, you can't see anything. You may be eaten by a grue!");
					//If the room isDark() and the player does not have the lamp or the lamp is not lit, then instead of printing the description, tell them: “It is pitch black, you can't see anything. You may be eaten by a grue!”.
				} else {
					System.out.println(playersRoom.getDescription()); 
					//prints the description of the current room object, as well as any objects that are in the room.
					if (playersRoom.getLamp()!=null) {
						//If the lamp is present in the room, print “There is an old oil lamp here that was made long ago” after you have printed out the room description.
						System.out.println("There is an old oil lamp here that was made long ago");
					} 
					if (playersRoom.getKey()!=null) {
						// If the key is present in the room, print “You see the outline of a key on a dusty shelf that's covered in dust.” after you have printed out the room description.
						System.out.println("You see the outline of a key on a dusty shelf that's covered in dust.");
					}
					if (playersRoom.getChest()!=null) {
						// If the chest is present in the room, print “There is a large, wooden, massive, oaken chest here with the word “CHEST” carved into it” after you have printed out the room description.
						System.out.println("There is a large, wooden, massive, oaken chest here with the word “CHEST” carved into it");  
					} 
					System.out.print("Exits are: ");
					//You should also print which exits from the room are valid.
					if (playersRoom.canGoEast()) {
						System.out.println("east");
					}
					if (playersRoom.canGoWest()) {
						System.out.println("west");
					}
					if (playersRoom.canGoNorth()) {
						System.out.println("north");
					}
					if (playersRoom.canGoSouth()) {
						System.out.println("south");
					}
				}
			}
			// GET KEY
			else if (command.equalsIgnoreCase("get key")) {
				if (playersRoom.getKey()!=null) {
					player.setKey(playersRoom.getKey()); //transfers the key to the user's inventory.
					playersRoom.clearKey(); //clear the key from the room 
					System.out.println("OK");
				} else {
					System.out.println("No key present");
				}
			}
			// UNLOCK CHEST
			else if (command.equalsIgnoreCase("unlock chest")) {
				if (player.getKey()==null) {
					//If the user doesn't have the key, print “Need a key to do any unlocking!”.
					System.out.println("Need a key to do any unlocking!");
				} 
				if (playersRoom.getChest()==null) {
					// If the chest is not present, print “No chest to unlock”.
					System.out.println("No chest to unlock");
				} else if (player.getKey()!=null) {
					//If the user has the key AND chest, call the use() method with the chest object to unlock it, then print “OK”.
					player.getKey().use(playersRoom.getChest());
					System.out.println("OK");
				}
			}
			// OPEN CHEST
			else if (command.equalsIgnoreCase("open chest")) {
				if (playersRoom.getChest()==null) {
					// If the chest is not present in the room, print “No chest present”.
					System.out.println("No chest present");		
				}else if (playersRoom.getChest().isLocked()) {
					// If the chest is locked, print “The chest is locked”.
					System.out.println("The chest is locked");
				} else {
					//If the chest is present in the room and is unlocked, then this should print out the chest's contents and end the game.
					System.out.println(playersRoom.getChest().getContents());
					System.exit(0);
				}
			}
			else {
				System.out.println("I'm sorry I don't know how to do that.");
			}

		} while (!eatenByAGrue); // repeatedly until the player dies (attacked by grue)
		keyboard.close();
	}

}

