package com.ab.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Buy extends Order {
	
	public Buy(LocalDateTime dateOpened, int quantity, double totalPrice, Stock stock) {
		
		super(dateOpened, quantity, totalPrice, stock);
	}

	@ManyToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;

}
