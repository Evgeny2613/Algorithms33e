package lessons.l1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println(" " + num1);

        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println(" " + num2);

        System.out.println("Enter the third number");
        int num3 = sc.nextInt();
        System.out.println(" " + num3);

        sum = num1 + num2 + num3;

        System.out.println("Sum of the three numbers is " + sum);
    }
}
