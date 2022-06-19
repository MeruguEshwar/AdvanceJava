package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity
@NamedQuery(name="bk", query="select b.BikeColour, b.BikeName from BikeMaincls b where b.BikeNumber=:ab")
public class BikeMaincls implements Serializable {

	   
	@Id
	private String BikeNumber;
	private String BikeColour;
	private String BikeName;
	private static final long serialVersionUID = 1L;

	public BikeMaincls() {
		super();
	}   
	public String getBikeNumber() {
		return this.BikeNumber;
	}

	public void setBikeNumber(String BikeNumber) {
		this.BikeNumber = BikeNumber;
	}   
	public String getBikeColour() {
		return this.BikeColour;
	}

	public void setBikeColour(String BikeColour) {
		this.BikeColour = BikeColour;
	}   
	public String getBikeName() {
		return this.BikeName;
	}

	public void setBikeName(String BikeName) {
		this.BikeName = BikeName;
	}
   
}
