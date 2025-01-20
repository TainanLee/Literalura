package com.util;


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ApiClient {
    public final RestTemplate restTemplate;

    public ApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public LivroDTO[] buscarLivros(String query) {
        String url = "http://gutendex.com/books/" + query;
        return restTemplate.getForObject(url, LivroDTO[].class);
    }

    private class RestTemplate {
        private String url;
        private Class<LivroDTO[]> aClass;

        public LivroDTO[] getForObject(String url, Class<LivroDTO[]> aClass) {
            this.url = url;
            this.aClass = aClass;
            return restTemplate.getForObject(url, aClass);
        }
    }
}