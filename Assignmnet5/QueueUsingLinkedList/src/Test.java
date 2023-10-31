import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Queue q1=new Queue();
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Exit");
			System.out.println("1 Push");
			System.out.println("2 Pop");
			System.out.println("3 Peek");
			choice=sc.nextInt();
			switch (choice) {
			case 1:
				q1.push();
				break;
			case 2:
				q1.pop();
				break;
			case 3:
				q1.peek();
				break;
			default:
				System.out.println("Please Enter valid Choice......");
				break;
			}
		} while (choice!=0);

	}

}
