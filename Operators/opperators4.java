package Operators;

import java.util.*;

public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();

        int c = a;
        a = b;
        b = c;


        System.out.println("a = " + a + ", b = " + b);
    }
}
