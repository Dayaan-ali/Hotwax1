package in.sp.entity;

import java.sql.Date;

public class Person {
	private String partyId;
	private String firstName;
	private String middleName;
	private String lastName;
	private char gender;
	private Date birthDate;
	private String maritalStatusEnumId;
	private String employmentStatusEnumId;
	private String occupation;

	public Person(String partyId, String firstName, String middleName, String lastName, char gender, Date birthDate,
			String maritalStatusEnumId, String employmentStatusEnumId, String occupation) {
		super();
		this.partyId = partyId;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.maritalStatusEnumId = maritalStatusEnumId;
		this.employmentStatusEnumId = employmentStatusEnumId;
		this.occupation = occupation;
	}

	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getMaritalStatusEnumId() {
		return maritalStatusEnumId;
	}

	public void setMaritalStatusEnumId(String maritalStatusEnumId) {
		this.maritalStatusEnumId = maritalStatusEnumId;
	}

	public String getEmploymentStatusEnumId() {
		return employmentStatusEnumId;
	}

	public void setEmploymentStatusEnumId(String employmentStatusEnumId) {
		this.employmentStatusEnumId = employmentStatusEnumId;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Person() {
		super();

	}

}
