package com.nt.bank;

public class HdfcBank {
	private int accNo;
	private double bal;
	private String name;
	
	
	public void deposite(double amt){
		bal=bal+amt;
		System.out.println(+amt+ "was deposited to account");
	}
	
	public double withDraw(double amt){
		bal=bal-amt;
		return bal;
	}
}
