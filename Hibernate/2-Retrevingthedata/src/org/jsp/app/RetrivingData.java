package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity

public class RetrivingData implements Serializable {

	   
	@Id
	private String CarNumber;
	private double CarPrise;
	private String CarColour;
	private static final long serialVersionUID = 1L;

	public RetrivingData() {
		super();
	}   
	public String getCarNumber() {
		return this.CarNumber;
	}

	public void setCarNumber(String CarNumber) {
		this.CarNumber = CarNumber;
	}   
	public double getCarPrise() {
		return this.CarPrise;
	}

	public void setCarPrise(double CarPrise) {
		this.CarPrise = CarPrise;
	}   
	public String getCarColour() {
		return this.CarColour;
	}

	public void setCarColour(String CarColour) {
		this.CarColour = CarColour;
	}
   
}
