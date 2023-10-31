import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	  
		Dequeue d1=new Dequeue();
		Scanner sc= new Scanner(System.in);
		int choice;
		do {
			System.out.println("0 Exit");
			System.out.println("1 Push");
			System.out.println("2 PopFirst");
			System.out.println("3 Pop Last");
			System.out.println("4 Display");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				d1.push();
				break;
			case 2:
				d1.popFirst();
				break;
			case 3:
				d1.PopLast();
				break;
			case 4:
				d1.Display();
				System.out.println();
				break;

			default:
				System.out.println("Enter valid choice please  .......");
				break;
			}
		} while (choice!=0);

	}

}
