package learning;

public class LeftRotate {
	static void leftRotate(int arr[], int d) {
		int n = arr.length;
		System.out.println(n);
		int temp=0;
		for(int i=0;i<=d;i++) {
			temp=arr[n-d];
			arr[n-d]=arr[i];
			arr[i]=temp;
			--d;
		}
		
		/*rvereseArray(arr, 0, d - 1);
		rvereseArray(arr, d, n - 1);
		rvereseArray(arr, 0, n - 1);*/
	}

	/*static void rvereseArray(int arr[], int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}*/

	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		leftRotate(arr, 3); // Rotate array by 2
		printArray(arr);
	}

}
