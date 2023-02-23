package in.ineuron.main;

import java.util.Arrays;

public class Q4SolutionMergeSort {
	//time complexity:nlogn
	
	
	
	
	//method to divide the array into sub arrays recursively
	static void divide(int[]arr,int start,int end)
	{
		if (start>=end) {
			return;
			
		}
	int middle=start+(end-start)/2;	
	//calling recursively the same function within the function itself(with different arguments)
	divide(arr, start, middle);
	//calling recursively the same function within the function itself(with different arguments)
	divide(arr, middle+1, end);
	conquer(arr,start,middle,end);
	}

	
	
	
	
	
	//another method to merge sorted elements
	 static void conquer(int[] arr, int start, int middle, int end)
	 {
		//creating a new array to store elements after sorting
		int[] mergedArray =new int[end-start+1];
		 
		//we are using two index
		//index1 will track the 1st array
		int index1=start;
		// index 2 will track the 2nd array
		int index2=middle+1;
		//and to track index of mergedArray we will initialize another index which starts from 0
		int x=0;
		
		
		//keep sorting untill this condition become false
		
		while (index1<=middle&&index2<=end) 
		{
			if (arr[index1]<=arr[index2]) 
			{
//				mergedArray[x]=arr[index1];
//				x++;index1++;
				//above two lines can be written in more simpler way
				mergedArray[x++]=arr[index1++];//as it post increment so first assignment 
			//	of value will take then increment of value takes place.

			}
			else {
				mergedArray[x++]=arr[index2++];
			}
			
		}
		
		//niche do while loop mein se koi ek hi while loop chalega 
		//aur hm while loop is liye chala rahe hain kyunki agr dono array ke elements compare 
		//karne ke baad kisi ek array mein elements bach jaaate hain iska matlab hai 
		//ki wo already sorted  elements hai .to isko waise hi store kar do mergedArray mein
		while (index1<=middle)
		{
			mergedArray[x++]=arr[index1++];
			
		}
		while (index2<=end) 
		{
			mergedArray[x++]=arr[index2++];
			
		}
		
		//ab sorting to ho gayi.ab iske baad original elements ke andar merged ko copy karna hai 
		for (int i = 0,j=start; i < mergedArray.length; i++,j++) 
		{
			arr[j]=mergedArray[i];
		}
	}

	 
	 
	public static void main(String[] args)
	{
		int[]arr= {33,-70,98,355,11,5565,0};
		int n= arr.length;//in array .length is not a method but a property
divide(arr, 0, n-1);
System.out.println(Arrays.toString(arr));
	}

}
