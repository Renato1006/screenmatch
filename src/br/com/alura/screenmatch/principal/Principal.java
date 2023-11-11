package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calc.FiltroRecomendacao;
import br.com.alura.screenmatch.calc.TimeCalculator;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme myFilm = new Filme("Click",2005);
        myFilm.setDurationInMinutes(120);
        myFilm.setIncludedInThePlan(true);

        myFilm.displaysDataSheet();

        myFilm.toRating(8);
        myFilm.toRating(5);
        myFilm.toRating(10);

        System.out.println("A média de avaliações do filme é: " + myFilm.averageRating());

        Serie flash = new Serie("The Flash",2013);
        flash.displaysDataSheet();
        flash.setSeasons(4);
        flash.setEpisodesPerSeason(15);
        flash.setMinutesPerEpisodes(25);
        System.out.println("Duração da série: " + flash.getDurationInMinutes());

        Filme secondFilm = new Filme("Boot",2015);
        secondFilm.setDurationInMinutes(130);
        secondFilm.setIncludedInThePlan(true);

        TimeCalculator calc = new TimeCalculator();
        calc.includesTime(myFilm);
        calc.includesTime(secondFilm);
        calc.includesTime(flash);
        System.out.println(calc.getTotalTime());

        FiltroRecomendacao filter = new FiltroRecomendacao();
        filter.filter(myFilm);

        Episodio episodio = new Episodio();
        episodio.setNumber(1);
        episodio.setSeries(flash);
        episodio.setTotalViews(500);
        filter.filter(episodio);

        var thirdFilme = new Filme("Titanic",1997);
        thirdFilme.setDurationInMinutes(120);
        thirdFilme.toRating(10);

        ArrayList<Filme> filmeArrayList = new ArrayList<>();
        filmeArrayList.add(myFilm);
        filmeArrayList.add(secondFilm);
        filmeArrayList.add(thirdFilme);

        System.out.println("Tamanho da lista " + filmeArrayList.size());
        System.out.println("Nome do primeiro filme: " + filmeArrayList.get(0).getName());

        System.out.println(filmeArrayList);
        System.out.println("toString do filme " + filmeArrayList.get(0).toString());


    }
}