package com.tnsif.daytwentythree;

public class Employee {

	private int empid;
	private String empName;
	private float salary;
	private String deptName;
	private String post;
	
	public Employee() {	}

	public Employee(int empid, String empName, float salary, String deptName, String post) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.salary = salary;
		this.deptName = deptName;
		this.post = post;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", salary=" + salary + ", deptName=" + deptName
				+ ", post=" + post + "]";
	}
	
}
