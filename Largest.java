import java.util.Scanner;

class Largest {
	public static void main(String args[])
	{
		int arr[] = new int[20];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = s.nextInt();
		System.out.println("Enter the elements:");
		
		for(int i=0; i<n; i++)
		{
			arr[i] = s.nextInt();
		}
		
		int smallest = arr[0];
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] > largest)
			{
				secondLargest = largest;
				largest = arr[i];
			}
			else if (arr[i] > secondLargest)
			{
				secondLargest = arr[i];
			}
			else if (arr[i] < smallest)
			{
				smallest = arr[i];
			}
		}
		
		System.out.println("Largest number is: " + largest);
		System.out.println("Second Largest number is: " + secondLargest);
		System.out.println("Smallest number is: " + smallest);
	}
}
