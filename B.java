package com.davaleba1;

import java.util.Scanner;

class B extends A {

    int y;

    public B(String halo) {
        super(halo);
    }


    public void b_metodi1() {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter y: ");
        y = t.nextInt();
    }

    public void b_method2() {
        System.out.println("jami: " + (x+y));
    }
}