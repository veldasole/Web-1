package domain;

import java.util.Date;

public class Agreement {
	
	private Long id;
	
	private Long number;
	
	private Date dateOpen;
	
	private Date dateClouse;
	
	private String note;
	
	public Agreement() {
	}
	
	public Agreement(Long id, Long number, Date dateOpen, Date dateClouse, String note) {
		this.id = id;
		this.number = number;
		this.dateOpen = dateOpen;
		this.dateClouse = dateClouse;
		this.note = note;
	}
	
	public Agreement(Long number, Date dateOpen, Date dateClouse, String note) {
		this.number = number;
		this.dateOpen = dateOpen;
		this.dateClouse = dateClouse;
		this.note = note;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getNumber() {
		return number;
	}
	
	public void setNumber(Long number) {
		this.number = number;
	}
	
	public Date getDateOpen() {
		return dateOpen;
	}
	
	public void setDateOpen(Date dateOpen) {
		this.dateOpen = dateOpen;
	}
	
	public Date getDateClouse() {
		return dateClouse;
	}
	
	public void setDateClouse(Date dateClouse) {
		this.dateClouse = dateClouse;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	public String toString() {
		return "Agreement {" + "Id = " + id + 
				", Number = " + number +
				", DateOpen = "+ dateOpen +
				", DateClouse = "+ dateClouse +
				", Note = "+ note;
	}
}
