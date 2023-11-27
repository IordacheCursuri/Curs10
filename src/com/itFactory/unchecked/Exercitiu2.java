package com.itFactory.unchecked;

public class Exercitiu2 {

    public static void main(String[] args) {

        try {
            System.out.println("A");

            doSomething(25);

            System.out.println("B");


        } finally {
            System.out.println("C");
        }


    }


    public static void doSomething(int x) {

        if(x > 10){
            throw new MyRuntimeException("Numarul este mai mare ca 10");
        }

        System.out.println("Totul este ok");

    }


}
