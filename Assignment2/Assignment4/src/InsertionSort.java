

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionSort {
	
	public static int  inserctionSort(int []arr,int size)
	{
		int count =0;
		for(int i = 1 ; i < size; i++) {
			
			int temp = arr[i];
			
			int j = i - 1;
			count++;
			while(j >= 0 && arr[j] < temp) {
				
				arr[j + 1] = arr[j];
				j--;
			}
		
			arr[j + 1] = temp;
	}
		return count;
	}

	public static void main(String[] args) {
		 int arr[]= {20,10,9,5,3};
		 System.out.println("Array before sort = "+Arrays.toString(arr));
		 int count=inserctionSort(arr, arr.length);
		 System.out.println("Total comprission is = "+count);
		 System.out.println("Array afer sort = "+Arrays.toString(arr));

	}

}
