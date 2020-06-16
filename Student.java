/**
 * Program Name: Student.java
 * Purpose: Holds Student information for the GUI student financial app
 * Coder: Sonia Friesen 0813682 Section 1
 * Date: Apr 13, 2019
 */

public class Student
{
	//data members
	private String studentID;
	private String surname;
	private String middleName;
	private String firstName;
	private String aptNumber;
	private String streetNumber;
	private String city;
	private String province;
	private String postalCode;
	private double cslLoanAmount;
	private double oslLoanAmount;
	
	
	//constructor
	public Student(String studentID, String surname,String middleName, String firstName,String aptNumber,String streetNumber,
								 String city,String province,String postalCode,double cslLoanAmount, double oslLoanAmount)
	{
		this.studentID = studentID;
		this.surname = surname;
		this.middleName = middleName;
		this.firstName = firstName;
		this.aptNumber = aptNumber;
		this.streetNumber = streetNumber;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		this.cslLoanAmount = cslLoanAmount;
		this.oslLoanAmount = oslLoanAmount;		
	}
	//getters
	public String getStudentID()
	{
		return studentID;
	}

	public String getSurename()
	{
		return surname;
	}

	public String getMiddleName()
	{
		return middleName;
	}

	public String getFirstName()
	{
		return firstName;
	}

	public String getAptNumber()
	{
		return aptNumber;
	}

	public String getStreetNumber()
	{
		return streetNumber;
	}

	public String getCity()
	{
		return city;
	}

	public String getProvince()
	{
		return province;
	}

	public String getPostalCode()
	{
		return postalCode;
	}

	public double getCslLoanAmount()
	{
		return cslLoanAmount;
	}
	//setters
	public double getOslLoanAmount()
	{
		return oslLoanAmount;
	}
	public void setSurename(String surename)
	{
		this.surname = surename;
	}
	public void setMiddleName(String middleName)
	{
		this.middleName = middleName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setAptNumber(String aptNumber)
	{
		this.aptNumber = aptNumber;
	}
	public void setStreetNumber(String streetNumber)
	{
		this.streetNumber = streetNumber;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public void setProvince(String province)
	{
		this.province = province;
	}
	public void setPostalCode(String postalCode)
	{
		this.postalCode = postalCode;
	}
	public void setCslLoanAmount(double cslLoanAmount)
	{
		this.cslLoanAmount = cslLoanAmount;
	}
	public void setOslLoanAmount(double oslLoanAmount)
	{
		this.oslLoanAmount = oslLoanAmount;
	}
	public String toString()
	{
		return ("Student Name: " + this.surname + ", " + this.firstName + " " + this.middleName +
						"\nStudent Nnumber: " + this.studentID + 
						"\nCSL Amount is " + this.cslLoanAmount +
						"\nOSL Amount is " + this.oslLoanAmount);		
	}
	
	
	
	
}
//endclass