package genericsAssignment;

import java.util.Arrays;

public class ExchangePosition {
	public static final void swap(int[] a,int i,int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	static void test() {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] brr= {1,22,33};
		System.out.println("Before swaping"+Arrays.toString(arr));
		swap(arr, 0, 6);
		System.out.println("After swapping"+Arrays.toString(arr));
		
		System.out.println("Before swaping"+Arrays.toString(brr));
		swap(brr,0,1);
		System.out.println("After swapping"+Arrays.toString(brr));
	}
	public static void main(String[] args) {
		test();
	
	}

}