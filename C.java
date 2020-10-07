package com.davaleba1;

import java.util.Scanner;

public class C {

    public static void main(String[] args) {

        int a, b, c;

        Scanner t = new Scanner(System.in);

        //metodi 1
        System.out.println("metodi 1");
        System.out.println("sheiyvanet A: ");
        a = t.nextInt();

        System.out.println("sheiyvanet B: ");
        b = t.nextInt();

        System.out.println("sheiyvanet C: ");
        c = t.nextInt();

        //metodi 2
        int a_1 = a%10;
        System.out.println("metodi 2: " + a_1);

        //metodi 3
        int b_bolo = b;
        while (b_bolo > 9) {
            b_bolo /= 10;
        }
        System.out.println("metodi 3: " + b_bolo);

        //metodi 4
        int m, n, sum = 0;
        m = c;
        if ((m / 10) == 0) {
            sum = c;
        } else {
            while (m > 0) {
                n = m%10;
                sum = sum+n;
                m = m/10;
            }
        }
        System.out.println("metodi 4: " + sum);

        //metodi 5
        int metodi__5 = a*b*c*a_1;
        System.out.println("metodi 5: " + metodi__5);

        //metodi 6
        System.out.println("metodi 6: " + b_bolo + metodi__5);

    }
}