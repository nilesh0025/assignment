package com.student.demo;

public class student {
	int sid;
	String firstname;
	String lastname;
	String fathername;
	String mothername;
	String classname;
	String dob;
	String gender;
	String add1;
	String add2;
	
	
	String parentcontact;
	int cid;
	public student() {
		super();
	}
	public student(int sid, String firstname, String lastname, String fathername, String mothername, String classname,
			String dob, String gender, String add1, String add2,String parentcontact ,int cid ) {
		super();
		this.sid = sid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fathername = fathername;
		this.mothername = mothername;
		this.classname = classname;
		this.dob = dob;
		this.gender = gender;
		this.add1 = add1;
		this.add2 = add2;
		
		this.cid = cid;
		this.parentcontact = parentcontact;
	}
	public int getsid() {
		return sid;
	}
	public void setsid(int sid) {
		this.sid = sid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	

	public String getParentcontact() {
		return parentcontact;
	}
	public void setParentcontact(String parentcontact) {
		this.parentcontact = parentcontact;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	

}
