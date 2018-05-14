package com.tecsup.gestion.model;

public class Department {

	
	int departmentid;
	String name;
	String description;
	String city;
	
	
	
	/**
	 * 
	 * @param name
	 * @param description
	 * @param city

	 */
	
	public Department(String name, String description, String city) {
		super();
		this.name = name;
		this.description = description;
		this.city = city;
		// TODO Auto-generated constructor stub
	}

	public Department() {
		super();
	}

	public int getDepartmentid() {
		return departmentid;
	}



	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", name=" + name + ", description=" + description
				+ ", city=" + city + "]";
	}
	
	
	
	
}