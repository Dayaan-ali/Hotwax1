package in.sp.entity;

public class Party {
	private String partyId;
	private String partyEnumTypeId;
	public Party(String partyId, String partyEnumTypeId) {
		super();
		this.partyId = partyId;
		this.partyEnumTypeId = partyEnumTypeId;
	}
	public Party() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getPartyId() {
		return partyId;
	}
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}
	public String getPartyEnumTypeId() {
		return partyEnumTypeId;
	}
	public void setPartyEnumTypeId(String partyEnumTypeId) {
		this.partyEnumTypeId = partyEnumTypeId;
	}

	

}
