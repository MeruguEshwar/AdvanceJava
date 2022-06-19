package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Info
 *
 */
@Entity

public class Info implements Serializable {

	   
	@Id
	private String RegNumber;
	private String Name;
	private int Marks;
	private int PhoneNumber;
	private String Address;
	private static final long serialVersionUID = 1L;

	public Info() {
		super();
	}   
	public String getRegNumber() {
		return this.RegNumber;
	}

	public void setRegNumber(String RegNumber) {
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
	public String getAddress() {
		return this.Address;
	}

	public void setAddress(String Address) {
		this.Address = Address;
	}
   
}
