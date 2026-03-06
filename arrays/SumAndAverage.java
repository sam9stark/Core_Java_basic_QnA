package arrays;

import java.util.Arrays;

public class SumAndAverage {

	public static void main(String[] args) {
		System.out.println("Welcome to Arrays (Sum & Average)");
		int [] arr = {1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum +arr[i];
		}
		int avg = sum/arr.length;
		System.out.println(Arrays.toString(arr));
		System.out.println("sum of the given array is : "+ sum);
		System.out.println("avg of the given array is : "+ avg);

	}
}
