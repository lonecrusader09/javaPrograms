/*23.	Calculate and return the sum of all the even numbers present in the numbers array passed to the method calculateSumOfEvenNumbers. Implement the logic inside calculateSumOfEvenNumbers() method. Test the functionalities using the main() method of the Tester class.
Sample Input : {68,79,86,99,23,2,41,100}     Sample Output: 256        
 Sample Input : {1,2,3,4,5,6,7,8,9,10}       Sample Output: 30
*/	
import java.util.*;

class sum
{
	
	int sum = 0;
	void sumOfEvenNumbers(int arr[])
	{
		for(int i = 0;i < arr.length;i++)
		{
			if(arr[i]%2 == 0)
			{
				sum = sum + arr[i];
			}
		}
	System.out.print("Sum of even elements: " + sum);
	}
}

class sumofeven
{
	public static void main(String[] args)
	{
		int arr[] = {68,79,86,99,23,2,41,100};
		sum s = new sum();
		s.sumOfEvenNumbers(arr);
	}
}