package com.pratap.model;

public class Student {

	int cwid;
	String fName, lName, email, password, password2;

	public Student(int cwid, String fName, String lName, String email, String password, String password2) {
		this.cwid = cwid;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.password2 = password2;
	}

	public int getCwid() {
		return cwid;
	}

	public void setCwid(int cwid) {
		this.cwid = cwid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	public boolean passwordCheck() {

		if (this.getPassword().equals(this.getPassword2())) {
			return true;
		}
		return false;
	}
}
