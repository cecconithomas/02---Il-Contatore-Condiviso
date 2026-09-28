package com.example;

import java.util.Random;

public class Lavoratore implements Runnable{
    private Contatore contatore;
    private String nome;

    public Lavoratore(Contatore contatore, String nome) {
        this.contatore = contatore;
        this.nome = nome;
    }
    @Override
    public void run() {
        Random random = new Random();
        boolean continua = true;

        while (continua) {
            continua = contatore.incrementa(nome);

            if (continua) {
                try {
                    int pausa = 100 + random.nextInt(401);
                    Thread.sleep(pausa);
                } catch (InterruptedException e) {
                    System.out.println(nome + " è stato interrotto.");
                }
            }
        }
    }
}
