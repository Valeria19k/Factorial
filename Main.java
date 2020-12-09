package com.company;

import java.util.Scanner;

public class Main {
    public static void Factorial(int k) {
        int res = 1;
        for (int i = 1; i < k + 1; i++) {
            res *= i;
        }
        System.out.print("The factorial of " + k + " is " + res);
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = in.nextInt();
        Factorial(n);
        // write your code here
    }
}
