
public class NonRepeating {
  
	public static int Find(int arr[],int size)
	{
		for(int i=0;i<size;i++)
		{
			int count=0;
			for(int j=0;j<size;j++)
			{
				if(arr[i]==arr[j])
				{
					count=count+1;	 
				}
			}
			if(count==1)
			{
		      return i;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		

		  int arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		  int ans=Find(arr,arr.length);
		  System.out.println(arr[ans]);
		  

	}

}
