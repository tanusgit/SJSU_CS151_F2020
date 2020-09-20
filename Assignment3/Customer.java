

public class Customer extends Person {
	private int customerID;
	private String paymentPreference;

	public Customer(String preference) {
		paymentPreference = preference;

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
		return "customer" + " = " + getFirstName() + " " + getLastName() + " " + getAddress() + " "
				+ customerID + " " + getPaymentPreference();
	}

	public void introduce() {
		String res = toString();
		System.out.println(res);
	}

	public void makePayment() {
		System.out.println("payment preference of the customer is " + paymentPreference);
	}

}
