import java.util.Arrays;
import java.util.Scanner;

public class NewSort {
	public static void seleSort(int []arr) {
	 int n = arr.length; 
	  
     for (int i = 0; i < n-1; i++) 
     { 
         int min_idx = i; 
         for (int j = i+1; j < n; j++) 
             if (arr[j] < arr[min_idx]) 
                 min_idx = j; 
         int temp = arr[min_idx]; 
         arr[min_idx] = arr[i]; 
         arr[i] = temp; 
     } 
     System.out.print(Arrays.toString(arr));
}
	public static void main(String []asd) {
		Scanner sc=new Scanner(System.in);
		System.out.println("number of elements:");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		seleSort(arr);
	}
}
