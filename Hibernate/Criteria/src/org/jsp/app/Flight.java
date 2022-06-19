package org.jsp.app;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the flight database table.
 * 
 */
@Entity
@NamedQuery(name="Flight.findAll", query="SELECT f FROM Flight f")
public class Flight implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String flightnumber;

	private double flightcost;

	private String flightname;

	public Flight() {
	}

	public String getFlightnumber() {
		return this.flightnumber;
	}

	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}

	public double getFlightcost() {
		return this.flightcost;
	}

	public void setFlightcost(double flightcost) {
		this.flightcost = flightcost;
	}

	public String getFlightname() {
		return this.flightname;
	}

	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}

	@Override
	public String toString() {
		return "Flight [flightnumber=" + flightnumber + ", flightcost=" + flightcost + ", flightname=" + flightname
				+ "]";
	}

}