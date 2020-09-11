package ass3;

public class Customer extends Person {
	private int customerID;
	private String paymentPreference;

	public Customer() {
		super();
		customerID++;

	}

	public Customer(String firstName, String lastName, Address address, int id) {
		super(firstName, lastName, address);
		customerID = id;
	}

	public int getID() {
		return customerID;
	}

	public void setID(int customerID) {
		this.customerID = customerID;
	}

	public String getPaymentPreference() {
		return paymentPreference;
	}

	public void setPaymentPreference(String paymentPreference) {
		this.paymentPreference = paymentPreference;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", paymentPreference=" + paymentPreference + "]";
	}

	public void introduce() {
		String res = "Customer [customerID=" + customerID + ", paymentPreference=" + paymentPreference + "]";
		System.out.println(res);
	}

	public void makePayment() {

	}
}
