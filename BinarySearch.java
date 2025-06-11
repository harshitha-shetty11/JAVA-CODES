import java.util.*;
class BinarySearch{
	public static int binarysearch(int arr[],int target){
		int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
			if(arr[mid]==target){
				return mid;
			}else if(arr[mid]>target){
				left=mid+1;
			}else if(arr[mid]<target){
				right=mid-1;
			}
		}
		return -1;
	}
	public static void main(String args[]){
		int[] arr = {2, 4, 6, 6, 9, 10, 12, 14};
        int target = 6;
		int result = binarysearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}

		