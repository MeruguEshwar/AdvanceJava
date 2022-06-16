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

	
	private String CarName;
	private String CarNumber;
	private String Brand;
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public String getCarName() {
		return this.CarName;
	}

	public void setCarName(String CarName) {
		this.CarName = CarName;
	}   
	public String getCarNumber() {
		return this.CarNumber;
	}

	public void setCarNumber(String CarNumber) {
		this.CarNumber = CarNumber;
	}   
	public String getBrand() {
		return this.Brand;
	}

	public void setBrand(String Brand) {
		this.Brand = Brand;
	}
   
}
