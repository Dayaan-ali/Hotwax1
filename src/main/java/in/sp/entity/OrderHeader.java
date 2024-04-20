package in.sp.entity;

import java.math.BigDecimal;
import java.security.Timestamp;

public class OrderHeader {

	private String orderId;
	private String orderName;
	private Timestamp placedDate;
	private Timestamp approvedDate;
	private String statusId;
	private String partyId;
	private String currencyUomId;
	private String productStoreId;
	private String salesChannelEnumId;
	private BigDecimal grandTotal;
	private Timestamp completedDate;
	public OrderHeader(String orderId, String orderName, Timestamp placedDate, Timestamp approvedDate, String statusId,
			String partyId, String currencyUomId, String productStoreId, String salesChannelEnumId,
			BigDecimal grandTotal, Timestamp completedDate) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.placedDate = placedDate;
		this.approvedDate = approvedDate;
		this.statusId = statusId;
		this.partyId = partyId;
		this.currencyUomId = currencyUomId;
		this.productStoreId = productStoreId;
		this.salesChannelEnumId = salesChannelEnumId;
		this.grandTotal = grandTotal;
		this.completedDate = completedDate;
	}
	public OrderHeader() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Timestamp getPlacedDate() {
		return placedDate;
	}
	public void setPlacedDate(Timestamp placedDate) {
		this.placedDate = placedDate;
	}
	public Timestamp getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(Timestamp approvedDate) {
		this.approvedDate = approvedDate;
	}
	public String getStatusId() {
		return statusId;
	}
	public void setStatusId(String statusId) {
		this.statusId = statusId;
	}
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getCurrencyUomId() {
		return currencyUomId;
	}
	public void setCurrencyUomId(String currencyUomId) {
		this.currencyUomId = currencyUomId;
	}
	public String getProductStoreId() {
		return productStoreId;
	}
	public void setProductStoreId(String productStoreId) {
		this.productStoreId = productStoreId;
	}
	public String getSalesChannelEnumId() {
		return salesChannelEnumId;
	}
	public void setSalesChannelEnumId(String salesChannelEnumId) {
		this.salesChannelEnumId = salesChannelEnumId;
	}
	public BigDecimal getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}
	public Timestamp getCompletedDate() {
		return completedDate;
	}
	public void setCompletedDate(Timestamp completedDate) {
		this.completedDate = completedDate;
	}
	
	

}
