package com.tnsif.dayeleven;

public class CourseDemo {
	public static void main(String[] args) {
		StudentInfo s;
		try {
			s = new StudentInfo("Arpan","BE");
		
			System.out.println(s);
		
			StudentInfo ss=new StudentInfo();
			ss.setName("Ritvik");
			ss.setCourse("MCA");
			System.out.println(ss);
		
			StudentInfo sss=new StudentInfo("Rushi","Diploma");
		}
		catch (InvalidCourseException e) {
			System.out.println("Error.. "+e);
		}
	}
}
