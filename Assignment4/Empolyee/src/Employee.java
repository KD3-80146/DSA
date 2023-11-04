import java.util.Scanner;

public class Employee {
     private int id;
     private String name;
     private double Salary;
     
     
     public Employee() {
		this.id=0;
		this.name="";
		this.Salary=0;
     }


	public Employee(int id, String name, double salary) {
		
		this.id = id;
		this.name = name;
		Salary = salary;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}
     
     public void acceptData()
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Id");
    	 this.id=sc.nextInt();
    	 System.out.println("Enter Name");
    	 this.name=sc.next();
    	 System.out.println("Enter Salary");
    	 this.Salary=sc.nextDouble();
    	 
     }


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
     
     
}
