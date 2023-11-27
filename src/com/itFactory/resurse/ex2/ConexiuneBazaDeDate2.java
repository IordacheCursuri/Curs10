package com.itFactory.resurse.ex2;

public class ConexiuneBazaDeDate2 implements AutoCloseable{

    public void connect(){
        System.out.println("Am deschis conexiunea");
    }



    @Override
    public void close() throws Exception {
        System.out.println("Am inchis conexiunea");
    }
}
