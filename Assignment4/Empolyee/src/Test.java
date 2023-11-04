import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		LinearLinkedList l1=new LinearLinkedList();
		int choice;
		Scanner sc=new Scanner(System.in);
	do {
		System.out.println("***********************");
		System.out.println("0 Exit");
		System.out.println("1 Add Employee");
		System.out.println("2 Display all Employee");
        System.out.println("3 Search Employee");
        System.out.println("4 Delete Employee");
        System.out.println("5 Update Employee");
        System.out.print("Enter choice = ");
        choice=sc.nextInt();
        System.out.println("*******************************");
        
        switch (choice) {
		case 1:
			Employee e1=null;
			l1.add(e1);
			break;
		case 2:
			l1.display();
			break;
		case 3:
			String name;
			System.out.print("Enter the Name = ");
			name=sc.next();
			l1.search(name);
			break;
		case 4:
			int id;
			System.out.print("Enter id = ");
			id=sc.nextInt();
			l1.delete(id);
			break;
		case 5:
			System.out.println("Enter Id and salary ");
			int id2=sc.nextInt();
			double salary2=sc.nextDouble();
			l1.Update(salary2, id2);
			break;
		default:
			System.out.println("Please Enter valid choice");
			break;
		}
	}while(choice!=0);
	}

}
