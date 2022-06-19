package jsp.org.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity

public class BoyFrnd implements Serializable {

	
	private String Name;   
	@Id
	private String PhoneNumber;
	private int Age;
	private static final long serialVersionUID = 1L;

	public BoyFrnd() {
		super();
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}   
	public int getAge() {
		return this.Age;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}
   
}
