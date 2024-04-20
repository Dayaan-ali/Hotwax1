package in.sp.entity;

public class Product {

	private String productId;
	private String partyId;
	private String productName;
	private String description;
	private char chargeShipping;
	private char returnable;

	public Product(String productId, String partyId, String productName, String description, char chargeShipping,
			char returnable) {
		super();
		this.productId = productId;
		this.partyId = partyId;
		this.productName = productName;
		this.description = description;
		this.chargeShipping = chargeShipping;
		this.returnable = returnable;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getChargeShipping() {
		return chargeShipping;
	}

	public void setChargeShipping(char chargeShipping) {
		this.chargeShipping = chargeShipping;
	}

	public char getReturnable() {
		return returnable;
	}

	public void setReturnable(char returnable) {
		this.returnable = returnable;
	}

}
