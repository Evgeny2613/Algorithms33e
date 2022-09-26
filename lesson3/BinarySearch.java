package lesson3;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 5, 7, 9, 14, 64, 76, 98, 105, 204, 345};
        System.out.println(binarySearch(arr, 345));
    }

    public static int binarySearch(int[] arr, int value) {
        Arrays.sort(arr);
        int mid = arr.length / 2;
        if (value == arr[mid])
            return mid;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (value < arr[mid])
                end = mid - 1;
            else if (value > arr[mid])
                start = mid + 1;
            else
                return mid;


        }
        return -1;
    }

}
