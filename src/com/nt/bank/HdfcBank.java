package com.nt.bank;

public class HdfcBank {
	 public static final double TRANSACTION_FEE = 0.01;
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
	
	public double getBal(){
		return bal;
	}
	
	  public void addMoney(double amount) {
	        bal = bal + amount;
	    }

	public boolean transfer(HdfcBank second, double d) {
		 double amt=0;
		if (amt > bal) {
	            return false;
	        } else {
	            bal = bal - (amt + (amt * TRANSACTION_FEE));
	        }
	        return false;
		
	}
}
