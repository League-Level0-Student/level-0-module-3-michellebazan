//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Heyy = new Robot();
		Heyy.penDown();
		Heyy.setPenColor(0, 0, 225);
		Heyy.setSpeed(90);
		Heyy.hide();
		// 3. Ask the user what color they would like the robot to draw
		String color = JOptionPane.showInputDialog(null, "Give me a color between Red and Blue");
		// 5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("red")) {
			Heyy.setPenColor(255, 0, 0);
		} else if (color.equalsIgnoreCase("Blue")) {
			Heyy.setPenColor(0, 102, 225);

		} else {

			Heyy.setRandomPenColor();

		}
		// 6. If the user doesn’t enter anything, choose a random color
		// 7. Put a loop around your code so that you keep asking the user for more
		// colors & drawing them
		// 4. Set the pen width to 10

		Heyy.setPenWidth(10);
		// 2. Make the robot draw a shape (this will take more than one line of code)
		/// for(int i = 0; i < 50; i++) {
		/// CODE FOR CIRCLE
		//// Heyy.move(10);
		//// Heyy.turn(10);
		//// }
		Heyy.move(30);
		Heyy.turn(90);
		Heyy.move(30);
		Heyy.turn(90);
	}
}
