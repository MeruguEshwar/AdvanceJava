package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity

public class Passport implements Serializable {

	   
	@Id
	private String PassportNumber;
	private int NumberOfPages;
	private static final long serialVersionUID = 1L;

	public Passport() {
		super();
	}   
	public String getPassportNumber() {
		return this.PassportNumber;
	}

	public void setPassportNumber(String PassportNumber) {
		this.PassportNumber = PassportNumber;
	}   
	public int getNumberOfPages() {
		return this.NumberOfPages;
	}

	public void setNumberOfPages(int NumberOfPages) {
		this.NumberOfPages = NumberOfPages;
	}
   
}
