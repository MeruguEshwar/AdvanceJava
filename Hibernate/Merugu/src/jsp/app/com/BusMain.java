package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity

public class BusMain implements Serializable {

	
	private String BusName;
	private double BusPrise;
	private String BusType;
	private static final long serialVersionUID = 1L;

	public BusMain() {
		super();
	}   
	public String getBusName() {
		return this.BusName;
	}

	public void setBusName(String BusName) {
		this.BusName = BusName;
	}   
	public double getBusPrise() {
		return this.BusPrise;
	}

	public void setBusPrise(double BusPrise) {
		this.BusPrise = BusPrise;
	}   
	public String getBusType() {
		return this.BusType;
	}

	public void setBusType(String BusType) {
		this.BusType = BusType;
	}
   
}
