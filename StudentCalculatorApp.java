/**
 * Program Name: StudentCalculatorApp.java
 * Purpose:This is the calculator part of the GUI app after students are inserted
 * Coder: Sonia Friesen 0813682 Section 2
 * Date: Apr 16, 2019
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class StudentCalculatorApp extends JFrame
{
	//class variables
	JTable studentInfo;
	JButton calc, clear, next;
	JLabel csl,osl,curPrimeIR,amortPeriodMonth, moncsl,monosl,totcsl,totosl,totBorrowed,totalInterst;
	JTextField tcsl,tosl,tcurPrimeIr,tamotPeroidMont,tmoncsl,tmonosl,ttotscl,ttotosl,ttotBorrowed,ttotalInterest;
	public StudentCalculatorApp()
	{
		super("Sonia Friesen's Student Loan Application");
		
		//boilerplate
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout() );//ANONYMOUS object
		this.setSize(600,200);
		this.setLocationRelativeTo(null);
		
		//get the arraylist
		ArrayList<Student> InfoStudent = new ArrayList<Student>();
		
		studentInfo = new JTable();
		
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}
	//end main
}
//endclass