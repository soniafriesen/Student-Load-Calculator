/**
 * Program Name: SF_LoanPayable.java
 * Purpose:Interface to calculate the annual rate to monthly rate based off of the GUI inputs
 * Coder: Sonia Friesen 0813682 Section 2
 * Date: Apr 13, 2019
 */

public interface SF_LoanPayable
{
	//data member
	double ANNUAL_RATE_TO_MONTHLY_RATE= 1/1200;
	
	//Method Name: calculateLoanPayment()
	//Purpose: Calculate the loan Payment
	//Arguments: Two doubles, one int
	//Return: double
	//abstract method
	double calculateLoanPayment(double loanAmount, double annualPrimeIR, int amortizarionPIM);
	
}
//endclass