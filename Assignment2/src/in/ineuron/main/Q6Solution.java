package in.ineuron.main;

public class Q6Solution {

	public static void main(String[] args) {
	int [] arr= {22,44,55,77,88,99};
	int n=arr.length;
	int[] subArr= {44,55,77};
	int m=subArr.length;
	System.out.println(isSubArray(arr, subArr, n, m) );

	}
    static boolean isSubArray(int[]arr,int[]subArr,int n,int m)
    {    
	boolean is=false;
	//Initializing the pointers
	int i = 0,j=0;
	while (i<n && j<m)
	{
		//if element matches increment both the pointers
		if (arr[i]==subArr[j]) 
		{
			i++;
			j++;
			
			if (j==m) 
			{
				is=true;
				return is;
			}
		}
		else 
		{
			i=i-j+1;
			j=0;
		}
		
	}
return is;
}
}

