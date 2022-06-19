package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity

public class Person implements Serializable {

	
	
	private String PersonName;   
	@Id
	private String PersonPhoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Passport passport;
	
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}   
	
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getPersonName() {
		return this.PersonName;
	}

	public void setPersonName(String PersonName) {
		this.PersonName = PersonName;
	}   
	public String getPersonPhoneNumber() {
		return this.PersonPhoneNumber;
	}

	public void setPersonPhoneNumber(String PersonPhoneNumber) {
		this.PersonPhoneNumber = PersonPhoneNumber;
	}
   
}
