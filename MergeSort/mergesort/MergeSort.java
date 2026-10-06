package mergesort;

public class MergeSort {

	public static void main(String[] args) {
		int[] array1 = {11,43,87,27,54,8,32,71,44,12};
		
		showArray(array1);
		mergeSort(array1);
		showArray(array1);
		
	}
	
	public static void showArray(int[] theArray) {
		int index;
		
		System.out.printf("[");
		for(index=0;index<theArray.length;index++) {
			if(index!=0) {
				System.out.printf(", ");
			}
			System.out.printf("%d",theArray[index]);
		}
		System.out.printf("]\n");
	}
	

	
	private static void mergeSort(int[] theArray, int left, int right) {
		//**************************************************************
		//*  Recursive Merge Sort                                      *
		//*------------------------------------------------------------*
		//*  1. Divide or partition the array section into 2 halves.   *
		//*  2. Create a subArray for each partition (half)            *
		//*  3. Merge the two subArrays to create one sorted array     *
		//*  4. Replace the original array section with the merged     *
		//*     array.                                                 *
		//**************************************************************
		if (left >= right) {
 		
			int mid = (left+right)/2;

		}
	}
	
	public static void splitAndSort(int[] arr, int left, int right, int mid) {
		int[] temp1 = new int[mid - left] ; //partitions of array
		int[] temp2 = new int[right - mid];
		
		for (int i = 0; i < temp1.length; i++) {
			temp1[i] = arr[left + i]; //before the middle?
		}
		for (int k = 0; k < temp2.length; k++) {
			temp2[k] = arr[mid + 1 + k]; //after the middle?
		}
		
		int i = 0, k = 0; // indices of subarrays
		int l = left; //index of merged array
		
		while (i < temp1.length && k < temp2.length) { // stop once one of them runs out of elements
			if (temp1[i] < temp2[k]) { // checking and then merging
				arr[l] = temp2[i];
				i++;
			} else {
				arr[l] = temp1[k];
				k++;
			}
			l++;
		}
		
		while (i < temp1.length) {
			arr[l] = temp1[i];
			i++;
			l++;
		}
		while (k < temp2.length) {
			arr[l] = temp2[k];
		}
	}
	 
	public static void mergeSort(int[] array) {
		//**********************************************
		//*  Class Wrapper for the recursive mergeSort *
		//**********************************************
		mergeSort(array,0,array.length-1);
	}
}
