/**
 * Program Name: CalculatorLoanApp.java
 * Purpose:This is the calculator part of the GUI application section
 * Coder: Sonia Friesen 0813682 Section 2
 * Date: April 17, 2019
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class CalculatorLoanApp extends JPanel
{
	JLabel sfriesen,cslLoan, oslLoan, currPrimeIR,amortPerMon,monCSL,monOSL,totMonPayment, 
	 			 totRepaidLoan,totBorrowed,totInterest;	
	JTextField textcslLoan, textoslLoan, textcurrPrimeIR,textamortPerMon,textmonCSL,textmonOSL,texttotMonPayment,texttotRepaidLoan,
			 			 texttotBorrowed,texttotInterest;
	JButton clear, calc;
	
	public CalculatorLoanApp()
	{
	//get the calculator part 
		this.setLayout(new BorderLayout());
	JPanel btnPanel2 = new JPanel();
	btnPanel2.setLayout(new GridLayout(1,4));
	clear = new JButton("Clear Fields");
	calc = new JButton("Calculate");	
	btnPanel2.add(clear);		
	btnPanel2.add(calc);
	this.add(btnPanel2, BorderLayout.SOUTH);
	
	sfriesen = new JLabel("Sonia's Loan Calulator");
	sfriesen.setHorizontalAlignment(SwingConstants.CENTER);
	this.add(sfriesen, BorderLayout.NORTH);
	
	//calculate the actual expenses
	JPanel calculator = new JPanel();
	calculator.setLayout(new GridLayout(10,2));			
	cslLoan = new JLabel("Canada Student Loan Amount");
	oslLoan = new JLabel("Ontario Student Loan Amount");
	currPrimeIR = new JLabel("Current Prime Interest Rate");
	amortPerMon = new JLabel("Amortization period in months");
	monCSL = new JLabel("Monthly CSL payment amount");
	monOSL = new JLabel("Monthly OSL payment amount");
	totMonPayment = new JLabel("Total monthly payment amount");
	totRepaidLoan = new JLabel("Total amount of your repaid loan");
	totBorrowed = new JLabel("Total amount you borrowed");
	totInterest = new JLabel("Total interest on your loans");
	
	//get the text fields		
	textcslLoan = new JTextField(); 
	textoslLoan = new JTextField();
	textcurrPrimeIR = new JTextField();
	textamortPerMon = new JTextField();
	textmonCSL = new JTextField();
	textmonOSL = new JTextField();
	texttotMonPayment = new JTextField();
	texttotRepaidLoan = new JTextField();
	texttotBorrowed = new JTextField();
	texttotInterest = new JTextField();
	
	//add to the calculator panel
	calculator.add(cslLoan);
	calculator.add(textcslLoan);
	calculator.add(oslLoan);
	calculator.add(textoslLoan);
	calculator.add(currPrimeIR);
	calculator.add(textcurrPrimeIR);
	calculator.add(amortPerMon);
	calculator.add(textamortPerMon);
	calculator.add(monCSL);
	calculator.add(textmonCSL);
	calculator.add(monOSL);
	calculator.add(textmonOSL);
	calculator.add(totMonPayment);
	calculator.add(texttotMonPayment);
	calculator.add(totRepaidLoan);
	calculator.add(texttotRepaidLoan);
	calculator.add(totBorrowed);
	calculator.add(texttotBorrowed);
	calculator.add(totInterest);
	calculator.add(texttotInterest);
	
	this.add(calculator, BorderLayout.CENTER);
	
	ButtonListener nanny = new ButtonListener();//calling default constructor
	clear.addActionListener(nanny);
	calc.addActionListener(nanny);	
	
	//add litenters
	}//end constructor
	
	//inner class
	private class ButtonListener implements ActionListener, SF_LoanPayable 
	{	
		@Override
		public void actionPerformed(ActionEvent ev)
		{
			//get the text field info
			String InfocslLoan = textcslLoan.getText();
			String InfooslLoan = textoslLoan.getText();
			String InfocurrPrimeIR = textcurrPrimeIR.getText();
			String InfoamortPerMon = textamortPerMon.getText();
			String InfoRepaidLoan = texttotRepaidLoan.getText();
						
			//pass them to a double
			double CSLoan = Double.parseDouble(InfocslLoan);
			double OSLoan = Double.parseDouble(InfooslLoan);
			double currPrime = Double.parseDouble(InfocurrPrimeIR);
			double repayLoan = Double.parseDouble(InfoRepaidLoan);
			int amortPM = Integer.parseInt(InfoamortPerMon);
			
			//get the amount borrowed formated
			DecimalFormat currenceyFormatter = new DecimalFormat("$0.00");
			double borrowed = CSLoan + OSLoan;
			texttotBorrowed.setText("" + currenceyFormatter.format(borrowed));
				
			
			if(ev.getSource().equals(calc))
			{
				double CSLPrime = currPrime + 2.5;
				double monCSL = calculateLoanPayment(CSLoan, CSLPrime, amortPM);
				textmonCSL.setText("" + currenceyFormatter.format(monCSL));
				
				double OSLPrime = currPrime + 1.0;
				double monOSL = calculateLoanPayment(OSLoan, OSLPrime, amortPM);
				textmonOSL.setText("" + currenceyFormatter.format(monOSL));
				
				double totalMonPay = monCSL + monOSL;
				texttotMonPayment.setText("" + currenceyFormatter.format(totalMonPay));
				
				double totalInterests = repayLoan - borrowed;
				texttotRepaidLoan.setText("" + currenceyFormatter.format(repayLoan));
				texttotInterest.setText("" + currenceyFormatter.format(totalInterests));
				
				if(CSLoan < 0 )
				{				
					JOptionPane error = new JOptionPane("Error, you cannot enter a negative value, converting to positive");
					double posCSLoan = -1.0 * CSLoan;
					textcslLoan.setText("" + currenceyFormatter.format(posCSLoan));
				}
				if(OSLoan < 0 )
				{
					JOptionPane error = new JOptionPane("Error, you cannot enter a negative value, converting to positive");
					double posOSLoan = -1.0 *OSLoan;
					textoslLoan.setText("" + currenceyFormatter.format(posOSLoan));
				}			
					
			}
			if(ev.getSource().equals(clear))
			{
				textcslLoan.setText(""); 
				textoslLoan.setText(""); 
				textcurrPrimeIR.setText(""); ;
				textamortPerMon.setText(""); 
				textmonCSL.setText(""); 
				textmonOSL.setText(""); ;
				texttotMonPayment.setText(""); 
				texttotRepaidLoan.setText(""); 
				texttotBorrowed.setText(""); 
				texttotInterest.setText(""); 
			}
		
		}
		
		@Override
		public double calculateLoanPayment(double loanAmount, double annualPrimeIR, int amortizarionPIM)
		{
			double A = loanAmount;
			double rate =  annualPrimeIR * SF_LoanPayable.ANNUAL_RATE_TO_MONTHLY_RATE;
			int N = amortizarionPIM;	
			double power = 1 + rate;
			double i = Math.pow(power, N);
			
			//get the equation results
			double p = A * rate * i/(i-1);
			
			//old style round to two decimals
			final double ROUND_TWO_DEC = 0.05;
			double pTemp = (p + ROUND_TWO_DEC)*100;
			int temp = (int)pTemp;
			double monthPay = (double)temp/100;
			//return
			return monthPay;
		}	//end method
		
	}//end buton literner
}
//endclass