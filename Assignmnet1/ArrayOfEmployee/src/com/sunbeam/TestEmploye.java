package com.sunbeam;

import java.util.Scanner;

public class TestEmploye {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		Employee []emp=new Employee[5];
		 emp[0]=new Employee(10,"ram",2000);
		 emp[1]=new Employee(20,"shyam",5000);
		 emp[2]=new Employee(30,"rohan",7000);
		 emp[3]=new Employee(40,"mohan",8000);
		 emp[4]=new Employee(50,"shyam",9000);
		 System.out.println("Enter the id ");
		 int id=sc.nextInt();
		 int count=0;
		  for(int i=0;i<emp.length;i++)
		  {
			  
			  if(emp[i].getEmpid()==id)
			  {
				  count++;
				  System.out.println("Employe id found ");
				  break;
				 
			  }
			 
		  }
		  if(count==0)
		  {
			  System.out.println("Employee not found ");
		  }
		 
		  System.out.println("Enter the name =");
		  String name=sc.next();
		  int co=0;
		  for(int i=0;i<emp.length;i++)
		  {
			  if(emp[i].getName().equalsIgnoreCase(name))
			  {
				  co++;
				  System.out.println("Employee name found");
				  break;
			  }
		  }
		  if(co==0)
		  {
			  System.out.println("Employee name not found");
		  }
		  System.out.println("Enter the Salary");
		  double salary=sc.nextDouble();
		  int d=0;
		  for(int i=0;i<emp.length;i++)
		  {
			  if(emp[i].getSalary()==salary)
			  { 
				  d++;
				  System.out.println("Employee Salary found");
			  }
		  }
		  if(d==0)
		  {
			  System.out.println("employee salary not found");
		  }

		 
	}

}
