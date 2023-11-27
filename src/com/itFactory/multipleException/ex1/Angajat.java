package com.itFactory.multipleException.ex1;

public class Angajat {

    public double calculeazaSalariulNet(double salariulBrut) throws InvalidSalaryException, ToBigSalaryException{

        if(salariulBrut <= 0) {
            throw new InvalidSalaryException("salariul brut nu trebuie sa fie mai mic sau egal cu zero");
        }

        if(salariulBrut > 10000) {
            throw new ToBigSalaryException("Salariul este mult prea mare. Valoarea maxima este de 10000");
        }

        double salariulNet = salariulBrut * 0.56;


        return salariulNet;

    }




}
