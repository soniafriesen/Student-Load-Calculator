/**
 * Program Name: NegativeValueException.java
 * Purpose: A class that will handle the negative value entered by user
 * Coder: Sonia Friesen 0813682 Section 2
 * Date: Apr 16, 2019
 */

public class NegativeValueException extends Exception
{	
	//data meber
	private double negativeNum;
	
	//constructor
	NegativeValueException(double negativeNum)
	{
		super("NegativeValueException, invalid input value of " + negativeNum + " was entered.");
		this.negativeNum = negativeNum;
	}	
	
}
//endclass