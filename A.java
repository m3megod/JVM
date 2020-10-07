package com.davaleba1;

import java.util.Scanner;

public class A {

    int x;
    String hello;

    //constructor
    public A(String halo) {
        hello = halo;
    }

    public static void main(String[] args) {
        B cons = new B("Hello");
        System.out.println(cons.hello);

        cons.metodi1();
        cons.metodi2();
        cons.method3();
        cons.b_metodi1();
        cons.b_metodi2();
    }

    public void metodi1() {
        Scanner t = new Scanner(System.in);
        System.out.println("sheitane x: ");
        x = t.nextInt();
    }

    public void metodi2() {
        System.out.println(x+12);
    }

    public void method3() {
        if (x % 2 == 0) {
            System.out.println("X is luwi");
        } else {
            System.out.println("X is kenti");
        }
    }
}