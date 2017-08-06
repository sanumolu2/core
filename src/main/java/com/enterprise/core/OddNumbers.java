package com.enterprise.core;

public class OddNumbers {
	public int findSum( int[] array){
		 int sum1=0;
		for(int i=0; i<array.length; i++)
		{
			if (array[i] %2 != 0){
		 
			sum1+=array[i];
				
			}
		
		}
		return sum1;
		
		}
	public float findAverage(int[] arr1)
	{
		
		float avg=0;
		for(int i=0; i<arr1.length;i++)
		{
			if ( arr1[i] !=0){
				avg+=arr1[i];
			}
			
			//if ( arr1[i] %2 !=0){
				//avg+=arr1[i];
			//}
		}
		
		avg= avg/arr1.length;
		
		return avg;
		
	}

}
