import java.util.*;
public class SelSort {
	public void insertionSort(int []arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					int k=arr[i];
					arr[i]=arr[j];
					arr[j]=k;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("number of elements:");
		int n=sc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		SelSort abc=new SelSort();
		abc.insertionSort(arr);
	}

}
