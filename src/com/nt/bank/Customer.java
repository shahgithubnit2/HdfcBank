

package com.nt.bank;

public class Customer {

	
public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		
	HdfcBank hdfc=new HdfcBank();
			
	  hdfc.deposite(1000);
			
	//  hdfc.deposite(7900);
	  
	//  hdfc.withDraw(7900);
	  
	  HdfcBank first = new HdfcBank();
	  HdfcBank second = new HdfcBank();

        first.addMoney(1010.0);
        second.addMoney(200.0);

        first.transfer(second, 100.0);
        System.out.println(second.getBal());
	}
}


