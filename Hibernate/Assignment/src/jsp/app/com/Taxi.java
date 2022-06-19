package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Taxi
 *
 */
@Entity

public class Taxi implements Serializable {

	   
	@Id
	private String TaxiNumber;
	private double TaxiPrise;
	private String Taxicolour;
	private static final long serialVersionUID = 1L;

	public Taxi() {
		super();
	}   
	public String getTaxiNumber() {
		return this.TaxiNumber;
	}

	public void setTaxiNumber(String TaxiNumber) {
		this.TaxiNumber = TaxiNumber;
	}   
	public double getTaxiPrise() {
		return this.TaxiPrise;
	}

	public void setTaxiPrise(double TaxiPrise) {
		this.TaxiPrise = TaxiPrise;
	}   
	public String getTaxicolour() {
		return this.Taxicolour;
	}

	public void setTaxicolour(String Taxicolour) {
		this.Taxicolour = Taxicolour;
	}
   
}
