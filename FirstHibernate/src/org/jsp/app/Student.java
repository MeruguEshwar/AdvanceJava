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

	
	private String StudentName;   
	@Id
	private int RegNumber;
	private String Stream;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public String getStudentName() {
		return this.StudentName;
	}

	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}   
	public int getRegNumber() {
		return this.RegNumber;
	}

	public void setRegNumber(int RegNumber) {
		this.RegNumber = RegNumber;
	}   
	public String getStream() {
		return this.Stream;
	}

	public void setStream(String Stream) {
		this.Stream = Stream;
	}
   
}
