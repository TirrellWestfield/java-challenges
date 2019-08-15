package autoboxing;

import java.util.ArrayList;

public class Branch {
	private String name;
	private ArrayList<customer> customers;
	
	public Branch(String name) { 
		this.name= name;
		this.customers= new ArrayList<customer>();
	}
	
	public String getName() { 
		return name; 
	}
	public boolean newcustomer(String customerName, double initialAmount) {
		if(findCustomer(customerName)== null) {
			this.customers.add(new customer(customerName, initialAmount));
			return true;
		}
		 return false; 
	}

	private Object findCustomer(String customerName) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addCustomerTransaction(String customerName, double amount) {
		customer existingCustomer = (customer) findCustomer(customerName);
		if(existingCustomer !=null) {
		existingCustomer.addTransaction(amount);	
		return true;
		}
		
		return false;
	}
	private customer findCustomers(String customerName) {
		for (int i=0; i<this.customers.size(); i++) { 
			if(this.customers.get(i).getName().equals(customerName)) {
				return this.customers.get(i);
			}
		} 
			return null;
	}
}


