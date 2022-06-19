package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: TrainMainCls
 *
 */
@Entity
@NamedQuery(name="tn", query="update TrainMainCls t set t.TrainType=:ab where t.TrainNumber=:bc")
public class TrainMainCls implements Serializable {

	
	private String TrainName;   
	@Id
	private int TrainNumber;
	private String TrainType;
	private static final long serialVersionUID = 1L;

	public TrainMainCls() {
		super();
	}   
	public String getTrainName() {
		return this.TrainName;
	}

	public void setTrainName(String TrainName) {
		this.TrainName = TrainName;
	}   
	public int getTrainNumber() {
		return this.TrainNumber;
	}

	public void setTrainNumber(int TrainNumber) {
		this.TrainNumber = TrainNumber;
	}   
	public String getTrainType() {
		return this.TrainType;
	}

	public void setTrainType(String TrainType) {
		this.TrainType = TrainType;
	}
   
}
