package com.office_hour;

public class Library {


    // we have custom sleep method that can wait certain amount of time when called like
    // library.sleep(3.5); through library class
    public static void sleep(double a){

        try {
            Thread.sleep((long)a*1000);
        } catch (InterruptedException e) {

        }

    }
}
