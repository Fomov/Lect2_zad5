package com.easylabs;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        if (a % 3 == 0) {
            System.out.println(" Делится на 3");
        } else
            System.out.println("Не делится на 3");
    }
}

