import java.util.*;
public class ArrangeNumbersInArray {

	public static void arrange(int[] arr) {
		
		for (int i = 0; i < arr.length-1; i = i+2) {
			int temp = arr[i];
			arr[i] = arr[i+1];
			arr[i+1] = temp;
		}
		
		printArray(arr);
	}
	
	public static void printArray(int [] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0) {
			
			int n = sc.nextInt();
			int arr[] = new int[n];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			
			arrange(arr);
		}
	}

}
