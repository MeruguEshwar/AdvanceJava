package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {

	
	private String studentName;   
	@Id
	private int regNumber;
	private double marks;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}   
	public int getRegNumber() {
		return this.regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}   
	public double getMarks() {
		return this.marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
   
}
