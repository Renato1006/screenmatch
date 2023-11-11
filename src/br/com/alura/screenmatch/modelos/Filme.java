package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calc.Classificavel;

public class Filme extends Titulo implements Classificavel {

    public Filme(String name, int year){
        super(name, year);
    }
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) averageRating() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getYear() + ") ";
    }
}
