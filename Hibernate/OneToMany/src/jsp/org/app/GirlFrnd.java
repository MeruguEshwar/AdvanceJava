package jsp.org.app;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;


@Entity

public class GirlFrnd implements Serializable {

	
	private String Name;   
	@Id
	private String phoneNumber;
	private int age;
	private static final long serialVersionUID = 1L;

	public GirlFrnd() {
		super();
	}   
	
	@OneToMany(cascade = CascadeType.ALL)
	 List<BoyFrnd> list;
	
	
	public List<BoyFrnd> getList() {
		return list;
	}

	public void setList(List<BoyFrnd> list) {
		this.list = list;
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
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
   
}
