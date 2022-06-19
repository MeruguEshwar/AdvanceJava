//bike
package jsp.app.com;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Auto
 *
 */
@Entity
@NamedQuery(name="bk", query="select b.AutoColour, b.AutoPrise from Auto b where b.AutoNumber=:ab")
public class Auto implements Serializable {

	   
	@Id
	private String AutoNumber;
	private double AutoPrise;
	private String AutoColour;
	private static final long serialVersionUID = 1L;

	public Auto() {
		super();
	}   
	public String getAutoNumber() {
		return this.AutoNumber;
	}

	public void setAutoNumber(String AutoNumber) {
		this.AutoNumber = AutoNumber;
	}   
	public double getAutoPrise() {
		return this.AutoPrise;
	}

	public void setAutoPrise(double AutoPrise) {
		this.AutoPrise = AutoPrise;
	}   
	public String getAutoColour() {
		return this.AutoColour;
	}

	public void setAutoColour(String AutoColour) {
		this.AutoColour = AutoColour;
	}
   
}
