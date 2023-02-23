package in.ineuron.main;

import java.util.Arrays;

public class Q3SolutionBubbleSort {

	public static void main(String[] args) {
		// worst case time complexity:O(N*N)
		//time  complexity:constant O(1) as it does not require any additional space (array) or anything. 
		int[] arr= {22,55,110,-1,0,766,433,211,88,5};
bubbleSort(arr);
System.out.println("the sorted array  is : "+Arrays.toString(arr));
	}
	
	 static void bubbleSort(int[] arr) {
		 boolean swapped;
		
		for (int i = 0; i < arr.length-1; i++) 
		{
			swapped=false;
			for (int j = 0; j < arr.length-1-i; j++) 
			{
				if (arr[j]>arr[j+1]) 
				{
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					//if swap happens change swapped to true
					swapped=true;
				}
				
			}
			//if for any i  no swapping takes place for j values ,break the loop and exit as the loop is already swapped
			if (!swapped) //!false=true
			{
				break;
			}
		}
	}
	
}
