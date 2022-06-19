//OneToOne relationsship
package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: husband
 *
 */
@Entity

public class husband implements Serializable {

	
	private String Name;   
	@Id
	private String mail;
	private static final long serialVersionUID = 1L;

	public husband() {
		super();
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}   
	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
   
}
