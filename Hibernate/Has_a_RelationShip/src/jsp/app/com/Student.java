package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Student
 *
 */
@Entity

public class Student implements Serializable {

	
	private String Name;   
	@Id
	private String Id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private ScholerShip sch;
	
	private static final long serialVersionUID = 1L;

	public Student() {
		super();
	}   
	public String getName() {
		return this.Name;
	}
	
	

	public ScholerShip getSch() {
		return sch;
	}
	public void setSch(ScholerShip sch) {
		this.sch = sch;
	}
	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getId() {
		return this.Id;
	}

	public void setId(String Id) {
		this.Id = Id;
	}
   
}
