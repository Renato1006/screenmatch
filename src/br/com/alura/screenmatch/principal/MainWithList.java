package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithList {
    public static void main(String[] args) {
        Filme myFilm = new Filme("Click",2005);
        myFilm.toRating(9);
        Serie flash = new Serie("The Flash",2013);
        Filme secondFilm = new Filme("Boot",2015);
        secondFilm.toRating(8);
        var thirdFilm = new Filme("Titanic",1997);
        thirdFilm.toRating(7);

        ArrayList<Titulo> list = new ArrayList<>();
        list.add(myFilm);
        list.add(secondFilm);
        list.add(thirdFilm);
        list.add(flash);

        for (Titulo item: list) {
            System.out.println(item.getName());

            if(item instanceof Filme film && film.getClassification() > 2){
                System.out.println("Classificação: " + film.getClassification());
            }
        }

        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Fernanda Montenegro");
        searchByArtist.add("Tony Ramos");
        searchByArtist.add("Taís Araújo");

        System.out.println("Lista de artistas sem ordenação: ");
        System.out.println(searchByArtist);

        System.out.println("Lista de artistas ordenada: ");
        Collections.sort(searchByArtist);
        System.out.println(searchByArtist);

        System.out.println("Lista de Títulos ordenadas: ");
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Ordenando por ano de lançamento: ");
        list.sort(Comparator.comparing(Titulo::getYear));
        System.out.println(list);
    }
}
