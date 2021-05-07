package com.dataStruct;

public class ReverseAnAraay {

	public static void main(String[] args) {
		int [] arr = {30, 5, 4, 15, 84} ;
		System.out.print("Before Reversing - ");
		for(int elements: arr) {
			System.out.print( elements + " ");
		}
		System.out.println("");
		System.out.print("After Reversing - ");
		ReverseArray(arr);
		

	}
	
	public static void ReverseArray(int arr[]) {
		int n = arr.length;
		int low = 0, high = n - 1;
		while (low < high) {
			
			//Swapping code below
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}

		for (int elements : arr) {
			System.out.print(elements + " ");
		}
	}

}
