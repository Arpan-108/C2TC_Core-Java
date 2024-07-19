package com.tnsif.daytwentythree;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Connection cn;
		List<Employee> empList;
		
		try {
			
			EmployeeService service = new EmployeeService();
			empList = service.getAllEmployees();
			System.out.println(empList);
			
			//Employee e = new Employee(4,"Avinesh", 64000, "Sales", "Asst. Manager");
			
//			if (service.deleteEmployee(2)) {
//				
//				System.out.println("Record deleted successfully");
//			}
//			else {
//				System.out.println("Record not found");
//			}
//			System.out.println("_________________________________________________________________");
//			
//			Employee emp = service.getEmployeeById(1);
//			if (emp != null) {
//				
//				emp.setSalary(emp.getSalary()+5000);
//				if (service.updateEmployee(1, emp)) {
//					
//					System.out.println("Record updated successfully....");
//				}
//				else {
//					System.out.println("Record not Found...");
//				}
//			}
			
			
			empList = service.getAllEmployees();
			System.out.println(empList);
			
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

}
