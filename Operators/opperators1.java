package Operators;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max1 = (a > b) ? a : b;
        int max2 = (max1 > c) ? max1 : c;
        int max3 = (max2 > d) ? max2 : d;

        System.out.println("Maximum: " + max3);
    }
}
