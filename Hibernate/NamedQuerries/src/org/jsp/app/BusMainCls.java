package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: BusMainCls
 *
 */
@Entity
@NamedQuery(name="bs", query="delete from BusMainCls b where b.BusNumber=:bn")
public class BusMainCls implements Serializable {

	   
	@Id
	private String BusNumber;
	private String BusType;
	private String Name;
	private static final long serialVersionUID = 1L;

	public BusMainCls() {
		super();
	}   
	public String getBusNumber() {
		return this.BusNumber;
	}

	public void setBusNumber(String BusNumber) {
		this.BusNumber = BusNumber;
	}   
	public String getBusType() {
		return this.BusType;
	}

	public void setBusType(String BusType) {
		this.BusType = BusType;
	}   
	public String getName() {
		return this.Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}
   
}
