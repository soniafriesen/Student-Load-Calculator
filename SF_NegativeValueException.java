/**
 * Program Name: SF_NegativeValueException.java
 * Purpose: Uses a try and catch block for the negative value exception
 * Coder: Sonia Friesen 0813682 Section 2
 * Date: Apr 17, 2019
 */

public class SF_NegativeValueException
{
	private double negNum;
	
	//constrcutor
	SF_NegativeValueException(double negNum) throws NegativeValueException
	{
		if(negNum < 0)
		{
			throw new NegativeValueException(negNum);
		}
		else
		{
			this.negNum = negNum;
		}		
	}
	
	//getter
	public double getNum()
	{
		return negNum;
	}
	
	public void setNumber(double number) throws NegativeValueException
	{
		if(number < 0)
		{
			throw new NegativeValueException(number);
		}
		else
		{
			this.negNum = number;
		}
	}	
	
}
//endclass