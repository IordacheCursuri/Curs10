package com.itFactory.unchecked;

public class Exercitiu1 {

    public static void main(String[] args) {

        try{
            System.out.println("A");

            doSomething(5);

            System.out.println("B");

        } catch (MyRuntimeException e) {
            System.out.println("C");
            System.out.println(e.getMessage());

        } finally {
            System.out.println("D");
        }

    }


    public static void doSomething(int x) {

        if(x > 10){
            throw new MyRuntimeException("Numarul este mai mare ca 10");
        }

        System.out.println("Totul este ok");

    }





}
