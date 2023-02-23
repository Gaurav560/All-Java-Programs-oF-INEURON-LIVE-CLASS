package in.ineuron.main;

import java.util.Arrays;

public class Q2SolutionQuickSort 
{

	public static void main(String[] args) 
	{
		// Quick Sort
		
int []arr= {22,11,55,0,-22,108,1,6};
int low=0;
int high=arr.length-1;
quickSort(arr, low, high);
System.out.println(Arrays.toString(arr));

	}
	static void quickSort(int [] arr, int low,int high) {
		if (low>=high) {
			return;
			
		}
		int start=low;
		int end=high;
		int mid=start+(end-start)/2;
		int pivot=arr[mid];
		while (start<=end)
		{
			
			while (arr[start]<pivot)
			{
				start++;
				
			}
			
			while (arr[end]>pivot) 
			{
				end--;
				
			}
			
			if (start<=end)
			{
				
				int temp=arr[end];
				arr[end]=arr[start];
				arr[start]=temp;
				start++;
				end--;
				
			}
		}
		quickSort(arr, low, end);
		quickSort(arr, start, high);
		
	}

}
