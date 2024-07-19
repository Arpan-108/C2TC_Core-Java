package com.tnsif.dayseven;

public class StudentDemo {

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.setUid("T05040811");
		s1.setName("Arpan");
		s1.setBranch("IT");
	//	Student.setTechTrainer("Alpana");
	//	Student.setSoftSkillTrainer("Divya");

		Student s2=new Student();
		s2.setUid("T05040820");
		s2.setName("Rutvik");
		s2.setBranch("CS");
	//	s2.setTechTrainer("Alpana");
	//	s2.setSoftSkillTrainer("Divya");
		
		Student s3=new Student("T05040803","Kunal","IT");
		
		System.out.println(s1);
	
		System.out.println(s2);
		
		System.out.println(s3);
	
	}

}
