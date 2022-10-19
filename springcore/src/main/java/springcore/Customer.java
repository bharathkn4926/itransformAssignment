package springcore;

public class Customer {
	private int customerId;
	private String customerName;
	private long customerContact;
	private Address customerAddress;
	
	//Constructor injection
//	public Customer(int customerId, String customerName, long customerContact, Address customerAddress) {
//	
//		this.customerId = customerId;
//		this.customerName = customerName;
//		this.customerContact = customerContact;
//		this.customerAddress = customerAddress;
//	}
	
	// setter injection
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public void details() {
			System.out.println( "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]");
			
	}
}
