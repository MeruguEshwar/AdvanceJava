package jsp.app.com;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: BikeMain
 *
 */
@Entity

public class BikeMain implements Serializable {

	   
	@Id
	private String BikeNumber;
	private Double BikePrice;
	private String BikeColour;
	private static final long serialVersionUID = 1L;

	public BikeMain() {
		super();
	}   
	public String getBikeNumber() {
		return this.BikeNumber;
	}

	public void setBikeNumber(String BikeNumber) {
		this.BikeNumber = BikeNumber;
	}   
	public Double getBikePrice() {
		return this.BikePrice;
	}

	public void setBikePrice(Double BikePrice) {
		this.BikePrice = BikePrice;
	}   
	public String getBikeColour() {
		return this.BikeColour;
	}

	public void setBikeColour(String BikeColour) {
		this.BikeColour = BikeColour;
	}
   
}
