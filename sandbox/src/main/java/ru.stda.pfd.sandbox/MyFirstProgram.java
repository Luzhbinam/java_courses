package ru.stda.pfd.sandbox.java;

public class MyFirstProgram {
    public static void main(String[] args) {
/*
        System.out.println(2+2);
        System.out.println(2-2);
        System.out.println(2*2);
        System.out.println(1/2);

        System.out.println(1.0/2);
        System.out.println(1/2.0);


        System.out.println(1.0+ "2");
        System.out.println("2= " + (2*3));
        System.out.println("2 = " + 2 + 3);


        System.out.println((2 *2) + 2 + 3);
        System.out.println((2 +2) + (2 *3));
        System.out.println(2 +2 + 2 *3);*/
    hello("world");
    hello("Siri");
hello("BroZER56789=-§");

        area();
    }
public static void hello(String somebody) {
       // String  somebody="world";
        System.out.println("Hello, "+ somebody+ "!");
    }
    public static void area() {
        double l = 8.0;

        double s = l * l;
        System.out.println("Площадь квадрата со стороной " + l + " = " + s);

    }
    }

