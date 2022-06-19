package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity

public class wife implements Serializable {

	
	private String Name;   
	@Id
	private String phoneNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	private husband hname;
	
	private static final long serialVersionUID = 1L;

	public wife() {
		super();
	} 


	public husband getHname() {
		return hname;
	}


	public void setHname(husband hname) {
		this.hname = hname;
	}




	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
   
}
