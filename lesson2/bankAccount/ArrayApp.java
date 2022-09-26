package lesson2.bankAccount;

public class ArrayApp {
    public static void main(String[] args) {

        long[] arr;
        arr = new long[10];
        long searchKey;
        int nElems = 0;

        arr[0] = 77;
        arr[1] = 55;
        arr[2] = 60;
        arr[3] = 44;
        arr[4] = 33;
        arr[5] = 22;
        arr[6] = 11;
        arr[7] = 10;
        arr[8] = 11;
        arr[9] = 43;

        nElems = 10;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        searchKey = 33;
        int i;
        for (i = 0; i < arr.length; i++)
            if (searchKey == arr[i])
                break;

        if (i == nElems)
                System.out.println("Can't find " + searchKey);
            else
                System.out.println("Search key is " + searchKey);


            searchKey = 11;

        for (int j = 0; j <arr.length; j++) {
            if (arr[j] == searchKey)
                break;
            for (int k = j; k < arr.length - 1; k++) {
                arr[k] = arr[k + 1];
            }
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

}

