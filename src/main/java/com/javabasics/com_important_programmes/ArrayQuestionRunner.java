package com.javabasics.com_important_programmes;

public class ArrayQuestionRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int[]reversedArray = reverseArray(arr);
		for(int num:reversedArray) {
			System.out.print(num + " ");
		}

	}
	public static int[] reverseArray(int arr[]) {
        int size = arr.length;
        int low = 0;
        int high = size-1;
        while(low<=high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low= low + 1;
                high = high- 1;
        }
        return arr;

}
}
