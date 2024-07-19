package com.tnsif.dayfourteen;

public class Student implements Comparable<Student>{
	
	private int rno;
	private String nameString;
	private float per;
	
	public Student() {
		super();
	}
	
	public Student(int rno, String nameString, float per) {
		super();
		this.rno = rno;
		this.nameString = nameString;
		this.per = per;
	}
	
	public int getRno() {
		return rno;
	}
	
	public void setRno(int rno) {
		this.rno = rno;
	}
	
	public String getNameString() {
		return nameString;
	}
	
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	public float getPer() {
		return per;
	}
	
	public void setPer(float per) {
		this.per = per;
	}
	
	@Override
	public int compareTo(Student o) {
		
		return (int)(o.getPer()-getPer());
		//return getRno()-o.getRno();
	}
	
	@Override
	public String toString() {
		return "\nStudent [rno=" + rno + ", nameString=" + nameString + ", per=" + per + "]";
	}
	
}
