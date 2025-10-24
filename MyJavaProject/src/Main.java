
	import java.util.Arrays;

	class Main
	{
		// Find the missing number in a limited range array `arr[1…n+1]`
		public static int findMissingElement(int[] arr)
		{
			int n = arr.length;

			// calculate the sum of all the array elements `arr`
			int sum = Arrays.stream(arr).sum();

			// expected sum - actual sum
			return (n + 1) + n * (n + 1)/2 - sum;
		}

		public static void main(String[] args)
		{
			// input array contains `n` numbers between 1 and `n+1`
			// with one number missing and no duplicates
			int[] arr = { 3, 2, 4, 6, 1 };

			System.out.println("The missing element is " + findMissingElement(arr));
		}
	}

