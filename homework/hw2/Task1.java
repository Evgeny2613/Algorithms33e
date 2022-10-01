/* В сборной по футболу есть 20 игроков,
 у каждого игрока есть свой номер. В массиве номера упорядочены и отсортированы в порядке возрастания.
 С помощью бинарного поиска(двоичного поиска) , найдите 3 игроков: игрока, который в массиве находится по середине,
 любого игрока, который находится левее,
 чем игрок посередине и любого игрока, который находится правее, чем игрок посередине.
 */

package homework.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter the players number to find(number less than 10: ");
        int p1 = input.nextInt();
        System.out.println("Enter the players number to find(number more than 10: ");
        int p3 = input.nextInt();

        System.out.println(Arrays.toString(threePlayers(arr, p1, p3)));
    }

    public static int[] threePlayers(int[] arr, int p1, int p3) {
        int[] newArr = new int[3];
        int mid = arr.length / 2;

        newArr[1] = mid;

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (p1 < arr[mid])
                end = mid - 1;
            else if (p1 > arr[mid])
                start = mid + 1;
            else if (p1 == arr[mid]) {
                newArr[0] = mid;
                break;
            }
            else
                newArr[0] = -1;
        }

        mid = arr.length / 2;
        start = 0;
        end = arr.length - 1;

        while (start <= end) {
            mid = (end - start) / 2 + start;
            if (p3 < arr[mid])
                end = mid - 1;
            else if (p3 > arr[mid])
                start = mid + 1;
            else if (p3 == arr[mid]) {
                newArr[2] = mid;
                break;
            }
            else
                newArr[2] = -1;
        }
            return newArr;
    }
}
