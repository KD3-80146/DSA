import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Stack s1=new Stack();
		int choice;
		
	     do {
			System.out.println("1 Push");
			System.out.println("2 Pop");
			System.out.println("3 Peek");
			System.out.println("0 Exit");
			choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				s1.push();
				break;
			case 2:
				s1.pop();
				break;
			case 3:
				s1.peek();
                break;
			default:
				System.out.println("Enter the valid choice.........");
				break;
			}
		
		} while (choice!=0);
		
	
	}

}
