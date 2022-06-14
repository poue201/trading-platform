package com.ab.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@NoArgsConstructor
//@AllArgsConstructor
@NoArgsConstructor
@AllArgsConstructor	
@Getter
@Setter
@ToString
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customerId;
	
	private String username;
	
	private String password;
	
	private double balance;
	
	private String email;
	
	@OneToMany( mappedBy = "customer", fetch = FetchType.EAGER)
	private List<Buy> buys;
	private List<Sell> sales;

}
