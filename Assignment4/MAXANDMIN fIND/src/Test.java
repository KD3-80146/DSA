
public class Test {

	public static void main(String[] args) {
		 
		MaxMin m1=new MaxMin();
		m1.addFirst(20);
		m1.addFirst(50);
		m1.addFirst(63);
		m1.addFirst(77);
		m1.addFirst(123);
		m1.display();
		int x=m1.minFind();
		int y=m1.maxFind();
		System.out.println("Maximum is "+y);
		System.out.println("Minimum is "+x);

	}

}
