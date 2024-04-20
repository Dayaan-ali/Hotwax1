package in.sp.entity;

public class Party {
	private String partyId;
	private String partyEnumTypeId;
	public String getparty_enum_type_id;

	public Party(String partyId, String partyEnumTypeId) {
		super();
		this.partyId = partyId;
		this.partyEnumTypeId = partyEnumTypeId;
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

	public Party() {
		super();
		
	}

}
