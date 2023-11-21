package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeErroException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main (String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um filme para a busca: ");
        var search = sc.nextLine();

        String url = "https://www.omdbapi.com/?t=" + search.replace(" ", "+") + "&apikey=7c41444";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb myTitleOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(myTitleOmdb);

//        try{
            Titulo myTitle = new Titulo(myTitleOmdb);
            System.out.println("Teste se deu certo converter: ");
            System.out.println(myTitle);
        } catch (NumberFormatException e){
            System.out.println("Erro: ");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        } catch (ErroDeConversaoDeErroException e){
            System.out.println(e.getMensagem());
        } finally {
            System.out.println("Programa deu certo");
        }

    }
}