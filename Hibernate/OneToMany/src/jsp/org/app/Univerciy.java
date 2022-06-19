package jsp.org.app;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

@Entity

public class Univerciy implements Serializable {

	
	
	private String uniName;
	@Id
	private String uniCode;
	private String uniAddress;
	
	@OneToMany(cascade = CascadeType.ALL)
	 List<College> list;
	
	private static final long serialVersionUID = 1L;

	public Univerciy() {
		super();
	} 
	
	public List<College> getList() {
		return list;
	}

	public void setList(List<College> list) {
		this.list = list;
	}

	public String getUniName() {
		return this.uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}   
	public String getUniCode() {
		return this.uniCode;
	}

	public void setUniCode(String uniCode) {
		this.uniCode = uniCode;
	}   
	public String getUniAddress() {
		return this.uniAddress;
	}

	public void setUniAddress(String uniAddress) {
		this.uniAddress = uniAddress;
	}
   
}
