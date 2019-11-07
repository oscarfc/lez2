/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez02_metodi;

/**
 *
 * @author tss
 */
public class AppMetodi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // caricamento voti
        int numVoti = Utils.AskInt("Enter numero voti");
        int[] voti = Utils.loadNumeri(numVoti);
        float media = Utils.calcolaMedia(voti);

        int valore1 = Utils.AskInt("dimmi la quantià", 1, 100);
        float valore2 = Utils.AskFloat("dimmi il peso caduno", 0, 20);
        //faccio il quadrato 
        float ris = valore1 * valore2;
        //faccio stamapre il nuovo valore 
        System.out.println("peso totale=" + ris);

        float prezzo = Utils.AskFloat("dimmi il prezzo in euro (es. 50 o 99.99)");
        float sconto = Utils.AskFloat("dimmi lo sconto % (es. 20 o 33.33)", 0, 100);

        float prezzoscontato = Utils.calcolaSconto(prezzo, sconto);
        String vistx = "prezzo=" + prezzo + "\n";
        vistx += "sconto = " + sconto + "\n";
        vistx += "prezzo scontato=" + prezzoscontato + "\n";
        System.out.println(vistx);

    }

}
