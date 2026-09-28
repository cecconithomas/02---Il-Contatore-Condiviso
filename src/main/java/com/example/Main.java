package com.example;

public class Main {
    public static void main(String[] args) {
        Contatore contatoreCondiviso = new Contatore();

        Lavoratore lav1 = new Lavoratore(contatoreCondiviso, "Thread-1");
        Lavoratore lav2 = new Lavoratore(contatoreCondiviso, "Thread-2");

        Thread t1 = new Thread(lav1);
        Thread t2 = new Thread(lav2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Il main è stato interrotto.");
        }

        System.out.println("Raggiunto il valore massimo del contatore!");
    
    }
}