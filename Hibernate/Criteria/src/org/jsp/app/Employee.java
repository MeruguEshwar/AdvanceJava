package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;


@Entity

public class Employee implements Serializable {

	
	private String ename;   
	@Id
	private int eid;
	private double esal;
	private String edesignation;
	private static final long serialVersionUID = 1L;

	public Employee() {
		super();
	}   
	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}   
	public int getEid() {
		return this.eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}   
	public double getEsal() {
		return this.esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}   
	public String getEdesignation() {
		return this.edesignation;
	}

	public void setEdesignation(String edesignation) {
		this.edesignation = edesignation;
	}
	@Override
	public String toString() {
		return "Employee [ename=" + ename + ", eid=" + eid + ", esal=" + esal + ", edesignation=" + edesignation + "]";
	}
   
}
