//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extras;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String input =  JOptionPane.showInputDialog("Do you like Bananas?");
		//2. if they say no, 
		if(input.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "You're crazy!!!!");
		    System.exit(0);
		} else 
			if(input.equalsIgnoreCase("yes")) {
				
				String input2 = JOptionPane.showInputDialog("What's your hobby?");
				
				JOptionPane.showMessageDialog(null, input2 + " is much better with Bananas!");
			}else
				JOptionPane.showMessageDialog(null, "You are Bananas!!1");
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes” or “no”
		//	show a pop up that says “You are bananas!”
	
	}

}
