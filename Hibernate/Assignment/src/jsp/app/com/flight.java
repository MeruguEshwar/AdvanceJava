package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: flight
 *
 */
@Entity
@NamedQuery(name="bs", query="delete from flightCls b where b.flightNumber=:bn")
public class flight implements Serializable {

	
	private double flightCost;
	private String flightName;   
	@Id
	private String flightNumber;
	private static final long serialVersionUID = 1L;

	public flight() {
		super();
	}   
	public double getFlightCost() {
		return this.flightCost;
	}

	public void setFlightCost(double flightCost) {
		this.flightCost = flightCost;
	}   
	public String getFlightName() {
		return this.flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}   
	public String getFlightNumber() {
		return this.flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
   
}
