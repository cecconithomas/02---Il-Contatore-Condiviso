package com.example;

class Contatore {
    private int valore = 0;
    private int valoreMassimo = 10;

    public synchronized boolean incrementa(String nomeThread) {
        if (valore < valoreMassimo) {
            valore++;
            System.out.println(nomeThread + " ha incrementato il contatore a: " + valore);
            return true;
        }
        return false;
    }
}
