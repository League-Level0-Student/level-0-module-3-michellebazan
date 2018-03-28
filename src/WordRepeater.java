import javax.swing.JOptionPane;

public class WordRepeater {
	public static void main(String[] args) {
	
		String input = JOptionPane.showInputDialog(null, "Give me a word");
		String number = JOptionPane.showInputDialog(null, "Give me a number");
		int x = Integer.parseInt(number);
		
		
		for(int i = 0; i < x; i++) {
			
			System.out.println(input);
			
			/////Message to whom who reads this: Sausage helped me and i printed out 10 pizzas on my first try
		}
	}
}
