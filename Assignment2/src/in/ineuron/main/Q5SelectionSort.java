package in.ineuron.main;

import java.util.Arrays;

public class Q5SelectionSort {

	public static void main(String[] args) 
	//selection sort :main fn ke alwa teen function ka use kar rahe hain  
	//ek index of maximum element nikaalane ke liye
	//ek swap karne ke liye max element ko uske correct last index se
	//aur ek selection sort naam ka method banaye hain jagah pe last index nikaal ke 
	//swap and getMaxIndex method call hote hain 
	
	{
	int[] arr= {11,1,88,40,-5656,3,555,366,-5,0,-55,490};
	selctionSort(arr);
	System.out.println(Arrays.toString(arr));

	}

	 static void selctionSort(int[] arr) 
	 {
		 for (int i = 0; i < arr.length-1; i++) 
		 {
			int last=arr.length-1-i;//i=0 ke liye hmara search array last index tak jaayega isi liye i=0 ke liye last index 4 hai 
			int maxIndex=getMaxIndex(arr, 0,last);
			swap(arr, maxIndex, last);
				
			
			
			
		}
		
		
	}
	 //method to find the index of maximum element in every search array (note:search array decreases with every pass)
	 static int getMaxIndex(int[]arr,int start,int end )
	 {
		 int max=start;//initializing max with zero as in every search array there will be different max element
		 for (int i = start; i <=end; i++)//ye i ko 0(start) se last(end)  tak chala rahe hain kyunki search array har paas ke baad change hota hai .kyunki har paas ke baad end change hota hai 
		 {
			 if(arr[max]<arr[i]) {
				 max=i;
			}
			
		}return max;
	 }
	 
	 //method to swap two elements in an array
	 static void swap(int[]arr, int first,int second) 
	 {
		 int temp=arr[second];
		 arr[second]=arr[first];
		 arr[first]=temp;
	 }
	 

}
