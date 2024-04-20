package in.sp.entity;

import java.math.BigDecimal;

public class OrderItem {
	private String orderId;
	private String orderItemSeqId;
	private String productId;
	private String itemDescription;
	private BigDecimal quantity;
	private BigDecimal unitAmount;
	private String itemTypeEnumId;
	
	public OrderItem(String orderId, String orderItemSeqId, String productId, String itemDescription,
			BigDecimal quantity, BigDecimal unitAmount, String itemTypeEnumId) {
		super();
		this.orderId = orderId;
		this.orderItemSeqId = orderItemSeqId;
		this.productId = productId;
		this.itemDescription = itemDescription;
		this.quantity = quantity;
		this.unitAmount = unitAmount;
		this.itemTypeEnumId = itemTypeEnumId;
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderItemSeqId() {
		return orderItemSeqId;
	}
	public void setOrderItemSeqId(String orderItemSeqId) {
		this.orderItemSeqId = orderItemSeqId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getUnitAmount() {
		return unitAmount;
	}
	public void setUnitAmount(BigDecimal unitAmount) {
		this.unitAmount = unitAmount;
	}
	public String getItemTypeEnumId() {
		return itemTypeEnumId;
	}
	public void setItemTypeEnumId(String itemTypeEnumId) {
		this.itemTypeEnumId = itemTypeEnumId;
	}



}
