package com.app.core;

import java.util.Date;
import static com.app.core.Employee.sdf;

//no, creation date , location
public class AdharCard {
	private String cardNumber;
	private Date creationDate;
	private String location;
	public AdharCard(String cardNumber, Date creationDate, String location) {
		super();
		this.cardNumber = cardNumber;
		this.creationDate = creationDate;
		this.location = location;
	}
	@Override
	public String toString() {
		return "AdharCard [cardNumber=" + cardNumber + ", creationDate=" + sdf.format(creationDate) + ", location=" + location
				+ "]";
	}
	
	
}
