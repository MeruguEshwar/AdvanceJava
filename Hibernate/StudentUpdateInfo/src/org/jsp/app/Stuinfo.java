package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stuinfo
 *
 */
@Entity

public class Stuinfo implements Serializable {

	   
	@Id
	private int RegNumber;
	private String Name;
	private int Marks;
	private int PhoneNumber;
	private String Addaddress;
	private static final long serialVersionUID = 1L;

	public Stuinfo() {
		super();
	}   
	public int getRegNumber() {
		return this.RegNumber;
	}

	public void setRegNumber(int RegNumber) {
		this.RegNumber = RegNumber;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public int getMarks() {
		return this.Marks;
	}

	public void setMarks(int Marks) {
		this.Marks = Marks;
	}   
	public int getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(int PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}   
	public String getAddaddress() {
		return this.Addaddress;
	}

	public void setAddaddress(String Addaddress) {
		this.Addaddress = Addaddress;
	}
   
}
