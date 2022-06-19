package jsp.org.app;

import java.io.Serializable;
import java.lang.Double;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Person
 *
 */
@Entity

public class Person implements Serializable {

	
	private String Name;
	private Double Weight;   
	@Id
	private int PhoneNumber;
	private static final long serialVersionUID = 1L;

	public Person() {
		super();
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public Double getWeight() {
		return this.Weight;
	}

	public void setWeight(Double Weight) {
		this.Weight = Weight;
	}   
	public int getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(int PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Weight=" + Weight + ", PhoneNumber=" + PhoneNumber + "]";
	}
	
   
}
