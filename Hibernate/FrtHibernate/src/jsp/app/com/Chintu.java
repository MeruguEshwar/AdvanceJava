package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Chintu
 *
 */
@Entity

public class Chintu implements Serializable {

	
	private String Studentname;
	private int marks;
	private int Regnumber;
	private static final long serialVersionUID = 1L;

	public Chintu() {
		super();
	}   
	public String getStudentname() {
		return this.Studentname;
	}

	public void setStudentname(String Studentname) {
		this.Studentname = Studentname;
	}   
	public int getMarks() {
		return this.marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}   
	public int getRegnumber() {
		return this.Regnumber;
	}

	public void setRegnumber(int Regnumber) {
		this.Regnumber = Regnumber;
	}
   
}
