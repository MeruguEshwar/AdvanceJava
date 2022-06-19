package jsp.org.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

@Entity

public class College implements Serializable {

	
	private String clgName;   
	@Id
	private String clgCode;
	private String clgAddress;
	private static final long serialVersionUID = 1L;

	public College() {
		super();
	}   
	public String getClgName() {
		return this.clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}   
	public String getClgCode() {
		return this.clgCode;
	}

	public void setClgCode(String clgCode) {
		this.clgCode = clgCode;
	}   
	public String getClgAddress() {
		return this.clgAddress;
	}

	public void setClgAddress(String clgAddress) {
		this.clgAddress = clgAddress;
	}
   
}
