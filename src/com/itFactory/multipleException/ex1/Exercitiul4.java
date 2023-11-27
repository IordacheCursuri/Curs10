package com.itFactory.multipleException.ex1;

public class Exercitiul4 {

    public static void main(String[] args) {

        Angajat angajat = new Angajat();

        double salariulBrut = 0;

        try {
            System.out.println("A");

            double salariulNetCalculat = angajat.calculeazaSalariulNet(salariulBrut);
            System.out.println("salariul este: " + salariulNetCalculat);

            System.out.println("B");
        } catch (InvalidSalaryException e) {
            System.out.println("C");
            System.out.println(e.getMessage());

        } catch (ToBigSalaryException e) {
            System.out.println("D");
            System.out.println(e.getMessage());
        }




    }


}
