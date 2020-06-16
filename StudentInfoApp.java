/**
 * Program Name: StudentInfoApp.java
 * Purpose: A GUI app that will create Student Objects and hold them in an ArrayList
 * Coder: Sonia Friesen 0813682 Section 2
 * Date: Apr 13, 2019
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class StudentInfoApp extends JPanel 
{
	 //class members
	ArrayList <Student> student = new ArrayList<Student>();
	JTextArea studentInfo;
	JLabel soniaflbl, firstName, surName,middleName,studentId,aptNumber,city,province,streetNum, postalCode,
				 cslLoanAmount, oslLoanAmount;
	JTextField fName, sName,mName,sId,sApt,scity,sprovince,sstreetNum, spostalCode,scslLoanAmount, soslLoanAmount;
	JButton nextStu, add,delete ;
	
	public StudentInfoApp()
	{
			super();//courtesy call
			
			//boilerplate
			this.setLayout(new BorderLayout() );//ANONYMOUS object
			this.setSize(600,700);			
			
			soniaflbl = new JLabel("Sonia's Student Information Sheet");
			soniaflbl.setHorizontalAlignment(SwingConstants.CENTER);
			this.add(soniaflbl, BorderLayout.NORTH);
			
			//get buttons on main frame
			JPanel btnPanel = new JPanel();
			
			btnPanel.setLayout(new GridLayout(1,4));
			add = new JButton("Add Current Student");
			nextStu = new JButton("Add Next Student");
			delete = new JButton("Delete Student");						
			btnPanel.add(add);
			btnPanel.add(nextStu);
			btnPanel.add(delete);			
			
			this.add(btnPanel, BorderLayout.SOUTH);
			
			//sub container for other fields
			JPanel infoPanel = new JPanel();			
			
			infoPanel.setLayout(new GridLayout(11,2));
			firstName = new JLabel("First Name "); 
			surName = new JLabel("Surname ");			
			middleName = new JLabel("Middle Name ");
			studentId = new JLabel("StudentId ");
			aptNumber = new JLabel("Apartment Number ");
			city = new JLabel("City ");
			province = new JLabel("Province ");
			streetNum = new JLabel("Street Number "); 
			postalCode = new JLabel("Postal Code ");
			cslLoanAmount = new JLabel("CSL Loan Amount "); 
			oslLoanAmount = new JLabel("OSL Loan Amount ");
			
			//get alignments
			firstName.setHorizontalAlignment(SwingConstants.RIGHT);
			surName.setHorizontalAlignment(SwingConstants.RIGHT);
			middleName.setHorizontalAlignment(SwingConstants.RIGHT);
			studentId.setHorizontalAlignment(SwingConstants.RIGHT);
			aptNumber.setHorizontalAlignment(SwingConstants.RIGHT);
			city.setHorizontalAlignment(SwingConstants.RIGHT);
			province.setHorizontalAlignment(SwingConstants.RIGHT);
			streetNum.setHorizontalAlignment(SwingConstants.RIGHT);
			postalCode.setHorizontalAlignment(SwingConstants.RIGHT);
			cslLoanAmount.setHorizontalAlignment(SwingConstants.RIGHT);
			oslLoanAmount.setHorizontalAlignment(SwingConstants.RIGHT);
			
			//JTextfeilds
			fName = new JTextField();
			sName = new JTextField();
			mName = new JTextField();
			sId = new JTextField();
			sApt = new JTextField();
			scity = new JTextField();
			sprovince = new JTextField();
			sstreetNum = new JTextField(); 
			spostalCode = new JTextField();
			scslLoanAmount = new JTextField(); 
			soslLoanAmount = new JTextField();
			
			//get the info student Buttons
			
			//add components to sub container panel
			infoPanel.add(firstName);
			infoPanel.add(fName);
			infoPanel.add(surName);
			infoPanel.add(sName);
			infoPanel.add(middleName);
			infoPanel.add(mName);
			infoPanel.add(studentId);
			infoPanel.add(sId);
			infoPanel.add(aptNumber);
			infoPanel.add(sApt);
			infoPanel.add(city);
			infoPanel.add(scity);
			infoPanel.add(province);
			infoPanel.add(sprovince);
			infoPanel.add(streetNum);
			infoPanel.add(sstreetNum);
			infoPanel.add(postalCode);
			infoPanel.add(spostalCode);
			infoPanel.add(cslLoanAmount);
			infoPanel.add(scslLoanAmount);			
			infoPanel.add(oslLoanAmount);
			infoPanel.add(soslLoanAmount);
			
			//add labels and buttons to panel
		this.add(infoPanel, BorderLayout.CENTER);	
		
		ButtonListener nanny = new ButtonListener();//calling default constructor
		add.addActionListener(nanny);
		delete.addActionListener(nanny);
		nextStu.addActionListener(nanny);	
				
	}	
	
	//inner class listener for the student form
	private class ButtonListener implements ActionListener//,SF_NegativeValueException
	{
		@Override
		public void actionPerformed(ActionEvent ev)
		{
			// Step 1: get the string values in the text fields to be added to the vector
			String firstname = fName .getText();
			String surname = sName.getText();
			String midName = mName.getText(); 
			String studentid = sId.getText();	
			String InfoApt = sApt.getText();
			String Infocity = scity.getText();
			String InfoProvince = sprovince.getText();
			String InfoStreetNum = sstreetNum.getText();
			String InfoPostalCode = spostalCode.getText();
			String InfocslLoanAmount = scslLoanAmount.getText();
			String InfooslLoanAmount = soslLoanAmount.getText();			
			
			//PARSE the String to a double using Double class method parseDouble()
			double CSLloan = Double.parseDouble(InfocslLoanAmount);
			double OSLloan = Double.parseDouble(InfooslLoanAmount);
			
			//determine which button was pushed using the getSource() method
			// of the ActionEvent object
			
			if(ev.getSource().equals(add))
			{
				Student stuInfo = new Student(studentid,surname,midName, firstname,InfoApt,InfoStreetNum, Infocity,
																			InfoProvince,InfoPostalCode,CSLloan, OSLloan);
				student.add(stuInfo);
								
		  }
			if(ev.getSource().equals(delete))
			{
				student.clear();
				fName.setText(""); 
				sName.setText("");  
				mName.setText("");  
				sId.setText("");  
				sApt.setText(""); 
				scity.setText("");  
				sprovince.setText(""); 
				sstreetNum.setText(""); 
				spostalCode.setText(""); 
				scslLoanAmount.setText("");   
				soslLoanAmount.setText("");  
			}
			if(ev.getSource().equals(nextStu))
			{
				fName.setText(""); 
				sName.setText("");  
				mName.setText("");  
				sId.setText("");  
				sApt.setText(""); 
				scity.setText("");  
				sprovince.setText(""); 
				sstreetNum.setText(""); 
				spostalCode.setText(""); 
				scslLoanAmount.setText("");   
				soslLoanAmount.setText("");  
			}			
		}//end actionPerformed	
  }//end inner class	
}
//endclass