package jsp.app.com;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: 
 *
 */
@Entity

public class ScholerShip implements Serializable {

	   
	@Id
	private int refNum;
	private String type;
	private static final long serialVersionUID = 1L;

	public ScholerShip() {
		super();
	}   
	public int getRefNum() {
		return this.refNum;
	}

	public void setRefNum(int refNum) {
		this.refNum = refNum;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
   
}
