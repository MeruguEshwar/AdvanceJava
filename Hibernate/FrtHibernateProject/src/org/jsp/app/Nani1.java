package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity

public class Nani1 implements Serializable {

	   
	@Id
	private String StudentName;
	private int Regnumber;
	private int Marks;
	private static final long serialVersionUID = 1L;

	public Nani1() 
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
	public int getRegnumber() 
	{
		return this.Regnumber;
	}

	public void setRegnumber(int Regnumber) {
		this.Regnumber = Regnumber;
	}   
	public int getMarks() 
	{
		return this.Marks;
	}

	public void setMarks(int Marks) 
	{
		this.Marks = Marks;
	}
   
}
