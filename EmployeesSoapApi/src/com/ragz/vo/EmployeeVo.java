package com.ragz.vo;

/**
 * @author ragz
 */

public class EmployeeVo {

	private int id;

	private String firstName;

	private String lastName;

	private String title;

	private String city;

	private String officePhone;

	private String cellPhone;

	private String email;

	private String picture;

	private String department;

	private EmployeeVo manager;

	private int reportCount;

	public EmployeeVo() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getOfficePhone() {
		return officePhone;
	}

	public void setOfficePhone(String officePhone) {
		this.officePhone = officePhone;
	}

	public String getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public EmployeeVo getManager() {
		return manager;
	}

	public void setManager(EmployeeVo manager) {
		this.manager = manager;
	}

	public int getReportCount() {
		return reportCount;
	}

	public void setReportCount(int reportCount) {
		this.reportCount = reportCount;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", title=" + title
				+ ", city=" + city + ", officePhone=" + officePhone + ", cellPhone=" + cellPhone + ", email=" + email
				+ ", picture=" + picture + ", department=" + department + ", manager=" + manager + ", reportCount="
				+ reportCount + "]";
	}

}
