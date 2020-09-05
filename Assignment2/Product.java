

public final class Product {
	final String productName;
	final String description;
	final int price;
	final int maximumQuantity;

	public Product(String productName, String description, int price, int maximumQuantity) {
		super();
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.maximumQuantity = maximumQuantity;
	}

	public String getProductName() {
		return productName;
	}

	public String getDescription() {
		return description;
	}

	public int getPrice() {
		return price;
	}

	public int getMaximumQuantity() {
		return maximumQuantity;
	}

	@Override
	public String toString() {
		return "Product name =" + productName + ", description = " + description + ", price = " + price
				+ ", maximum quantity=" + maximumQuantity;
	}
	

}
