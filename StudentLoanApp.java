/**
 * Program Name: StudentLoanApp.java
 * Purpose: Uses a JTabbPane to display the to forms
 * Coder: Sonia Friesen 0813682 Section 2
 * Date: Apr 17, 2019
 */
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class StudentLoanApp
{

	public static void main(String[] args)
	{
	// create the top level container
			JFrame frame = new JFrame("Sonia Friesen's Student Loan Application");
			
			//boilerplate
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(600, 500);
			//default will be BorderLayout
			frame.setLocationRelativeTo(null);
			
			JTabbedPane tPane = new JTabbedPane();
			
			tPane.add("Student Information Form", new StudentInfoApp());
			tPane.add("Loan Payment Form", new CalculatorLoanApp());			
			
			frame.add(tPane);
			
			//set visible
			frame.setVisible(true);

	}
	//end main
}
//endclass