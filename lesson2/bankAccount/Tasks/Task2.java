package lesson2.bankAccount.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find its position in the array: ");
        int value = input.nextInt();

        System.out.println(positionOfValue(arr, value));
    }

    public static int positionOfValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
