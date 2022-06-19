package org.jsp.app;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;





@Entity

public class Book implements Serializable {

	   
	@Id
	private String BookTitle;
	private String BookAuthor;
	private int Edition;
	private int Prise;
	private String Type;
	private static final long serialVersionUID = 1L;

	public Book() {
		super();
	}   
	public String getBookTitle() {
		return this.BookTitle;
	}

	public void setBookTitle(String BookTitle) {
		this.BookTitle = BookTitle;
	}   
	public String getBookAuthor() {
		return this.BookAuthor;
	}

	public void setBookAuthor(String BookAuthor) {
		this.BookAuthor = BookAuthor;
	}   
	public int getEdition() {
		return this.Edition;
	}

	public void setEdition(int Edition) {
		this.Edition = Edition;
	}   
	public int getPrise() {
		return this.Prise;
	}

	public void setPrise(int Prise) {
		this.Prise = Prise;
	}   
	public String getType() {
		return this.Type;
	}

	public void setType(String Type) {
		this.Type = Type;
	}
   
}
