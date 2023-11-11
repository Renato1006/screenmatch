package br.com.alura.screenmatch.calc;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

   /* public void includesTime(Filme f){
        totalTime += f.getDurationInMinutes();
    }

    public void includesTime(Serie s){
        totalTime += s.getDurationInMinutes();
    }*/

    public void includesTime(Titulo t){
        this.totalTime += t.getDurationInMinutes();
    }
}
