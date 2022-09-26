package lesson3;

public class LinearSearch {
    public static void main(String[] args) {

    }

    public static int linearSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value)
                return i;
        }
        return -1;
    }
}
