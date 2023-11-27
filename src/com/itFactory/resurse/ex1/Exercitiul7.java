package com.itFactory.resurse.ex1;

public class Exercitiul7 {

    public static void main(String[] args) {

        int x = 10;

        ConexiuneBazaDeDate conexiuneBazaDeDate = null;

        try {

            conexiuneBazaDeDate = new ConexiuneBazaDeDate();
            conexiuneBazaDeDate.connect();


            if (x == 10) {
                throw new RuntimeException("a aparut o problema");
            }


        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } finally {

            if (conexiuneBazaDeDate != null) {
                conexiuneBazaDeDate.close();
            }


        }


    }


}
