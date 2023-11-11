package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calc.Classificavel;

public class Episodio implements Classificavel {
    private int number;
    private String name;
    private Serie series;
    private int totalViews;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSeries() {
        return series;
    }

    public void setSeries(Serie series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100){
            return 4;
        }
        else {
            return 2;
        }
    }
}
