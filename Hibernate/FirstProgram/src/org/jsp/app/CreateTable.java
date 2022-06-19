package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity

public class CreateTable implements Serializable {

	
	private String StudentName;   
	@Id
	private int PhoneNumber;
	private int RegNumber;
	private String Location;
	private static final long serialVersionUID = 1L;

	public CreateTable() 
	{
		super();
	}   
	public String getStudentName() 
	{
		return this.StudentName;
	}

	public void setStudentName(String StudentName) 
	{
		this.StudentName = StudentName;
	}   
	
	public int getPhoneNumber() 
	{
		return this.PhoneNumber;
	}

	public void setPhoneNumber(int PhoneNumber) 
	{
		this.PhoneNumber = PhoneNumber;
	}   
	
	public int getRegNumber() {
		return this.RegNumber;
	}

	public void setRegNumber(int RegNumber) 
	{
		this.RegNumber = RegNumber;
	}   
	
	public String getLocation() 
	{
		return this.Location;
	}

	public void setLocation(String Location) 
	{
		this.Location = Location;
	}
   
}
