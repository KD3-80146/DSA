
public class Test {

	public static void main(String[] args) {
		Stack s1=new Stack(5);
		Stack s2 =new Stack(5);
		s1.push(6);
		s1.push(5);
		s1.push(7);
		s1.push(8);
		s1.push(10);
		for(int i=0;i<4;i++)
		{
			int x=s1.peek();
			s2.push(x);
			s1.pop();
		}
		System.out.println("done");
		

	}

}
