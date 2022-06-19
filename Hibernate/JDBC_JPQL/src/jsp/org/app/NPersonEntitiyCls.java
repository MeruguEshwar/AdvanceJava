//Insert
package jsp.org.app;
import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: NPersonEntitiyCls
 *
 */
@Entity
@NamedQuery(name="bk", query="select b.Name, b.Weight from NPersonEntitiyCls b where b.PhoneNumber=:ab")
public class NPersonEntitiyCls implements Serializable {

	
	private String Name;
	private String Weight;   
	@Id
	private String PhoneNumber;
	private static final long serialVersionUID = 1L;

	public NPersonEntitiyCls() {
		super();
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getWeight() {
		return this.Weight;
	}

	public void setWeight(String Weight) {
		this.Weight = Weight;
	}   
	public String getPhoneNumber() {
		return this.PhoneNumber;
	}

	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber = PhoneNumber;
	}
   
}
