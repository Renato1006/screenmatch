package br.com.alura.screenmatch.calc;

public class FiltroRecomendacao {
    public void filter(Classificavel classifiable){
        if (classifiable.getClassification() >= 4){
            System.out.println("Está entre os melhores!!");
        } else if (classifiable.getClassification() >= 2) {
            System.out.println("Está bem avaliado!");
        } else {
            System.out.println("Assita depois...");
        }
    }
}
