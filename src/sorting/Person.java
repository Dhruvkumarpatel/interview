package sorting;

import java.util.Date;

public class Person {
	
	private int person_id;
	private String fName;
	private String lName;
	private Date birthDate;
	private String gender;
	
	public Person(int person_id, String fName, String lName, Date birthDate, String gender) {
		super();
		this.person_id = person_id;
		this.fName = fName;
		this.lName = lName;
		this.birthDate = birthDate;
		this.gender = gender;
	}

	public int getPerson_id() {
		return person_id;
	}

	public void setPerson_id(int person_id) {
		this.person_id = person_id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
