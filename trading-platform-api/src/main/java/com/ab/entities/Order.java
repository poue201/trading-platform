package com.ab.entities;

import java.time.LocalDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@MappedSuperclass
public abstract class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	private LocalDateTime dateOpened;
	private int quantity;
	private double totalPrice;
	private Stock stock;
	
	public Order(LocalDateTime dateOpened, int quantity, double totalPrice, Stock stock) {
		
		this.dateOpened = dateOpened;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.stock = stock;
	}
	

}
