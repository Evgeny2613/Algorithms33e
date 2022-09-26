package lesson2.bankAccount;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 6, 7, 23, 4, 53, 54, 23, 34, 64};
        System.out.println(searchLinear(arr, 53));
    }

    public static int searchLinear(int[] arr, int elementToFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToFind)
                return i;
        }
        return -1;
    }

}
