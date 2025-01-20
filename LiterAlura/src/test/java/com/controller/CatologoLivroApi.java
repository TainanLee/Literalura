package com.controller;

import org.springframework.stereotype.Service;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CatologoLivroApi {


    @Service
    public static class BookService {

        private final HttpClient httpClient;

        public BookService() {
            this.httpClient = HttpClient.newHttpClient();
        }

        public String getBooks() throws Exception {
            // Construindo a solicitação
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://api.guntdex.com/books")) // URL da API de livros
                    .header("Accept", "application/json") // Cabeçalho para aceitar JSON
                    .GET() // Método HTTP
                    .build();

            // Enviando a solicitação e recebendo a resposta
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            // Verificando o código de status da resposta
            if (response.statusCode() == 200) {
                return response.body(); // Retorna o corpo da resposta se a requisição for bem-sucedida
            } else {
                throw new RuntimeException("Falha na requisição: " + response.statusCode());
            }
        }
    }
}
