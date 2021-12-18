package youTube;

import javax.swing.JOptionPane;

public class GUI {

	public static void main(String[] args) {
		String log = JOptionPane.showInputDialog("Enter:");
		JOptionPane.showMessageDialog(null, log);
		
		// JOptionPane.showInputDialog => return a "String";
		
		int age = Integer.parseInt(JOptionPane.showInputDialog("Age: "));
		JOptionPane.showMessageDialog(null, age);
		
		Double a = Double.parseDouble(JOptionPane.showInputDialog("2 digits:" ));
		JOptionPane.showMessageDialog(null, a);
		

	}

}
