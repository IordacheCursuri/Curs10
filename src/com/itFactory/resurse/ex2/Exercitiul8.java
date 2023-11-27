package com.itFactory.resurse.ex2;

public class Exercitiul8 {

    public static void main(String[] args) {

        int x = 10;


        try (ConexiuneBazaDeDate2 conexiune1 = new ConexiuneBazaDeDate2();
             ConexiuneBazaDeDate2 conexiune2 = new ConexiuneBazaDeDate2()) {

            System.out.println("A");

            conexiune1.connect();
            conexiune2.connect();

            if(x == 10) {
                throw new RuntimeException("A aparut o problema!!!");
            }

            System.out.println("B");


        } catch ( Exception e) {
            System.out.println("C");

        } finally {
            System.out.println("D");

        }





    }




}
