package lesson2.bankAccount.Tasks;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers (row by row):");

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println(sum(num1, num2, num3));

    }

    public static int sum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }
}
