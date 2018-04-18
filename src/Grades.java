import javax.swing.JOptionPane;

public class Grades {
	
	public static void main(String[] args){
		
		String input = JOptionPane.showInputDialog(null, "Give me your grade");
		double num = Double.parseDouble(input);
		
		if(num >= 97.0 && num <= 100.0) {
			JOptionPane.showMessageDialog(null, "You got a A+!");
		}else
			if(num >= 94 && num <= 96.99) {
				JOptionPane.showMessageDialog(null, "You got a A!");
		} else
			if(num >= 90 && num <= 93.99) {
				JOptionPane.showMessageDialog(null, "You got a A-!");
		}else
			if(num >= 87 && num <= 89.99) {
			JOptionPane.showMessageDialog(null, "You got a B+!");
	    }else
			if(num >= 84 && num <= 86.99) {
				JOptionPane.showMessageDialog(null, "You got a B!");
		}else
			if(num >= 80 && num <= 83.99) {
				JOptionPane.showMessageDialog(null, "You got a B-!");
		}else
			if(num >= 77 && num <= 79.99) {
				JOptionPane.showMessageDialog(null, "You got a C+!");
		}else
			if(num >= 74 && num <= 76.99) {
				JOptionPane.showMessageDialog(null, "You got a C!");
		}else
			if(num >= 70 && num <= 73.99) {
				JOptionPane.showMessageDialog(null, "You got a C-");
		}else
			if(num >= 67 && num <= 69.99) {
				JOptionPane.showMessageDialog(null, "You got a D+!");
		}else
			if(num >= 64 && num <= 66.99) {
				JOptionPane.showMessageDialog(null, "You got a D!");
		}else
			if(num >= 60 && num <= 63.99) {
				JOptionPane.showMessageDialog(null, "You got a D-!");
		}else
			if(num >= 0 && num <= 59.99) {
				JOptionPane.showMessageDialog(null, "You got a F! :)");
		} else {
			JOptionPane.showMessageDialog(null, "ERROR 707");
			
			
		}
}
}


	
	
	
	
