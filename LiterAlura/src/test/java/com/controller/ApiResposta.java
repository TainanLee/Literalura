package com.controller;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ApiResposta {
    public class Book {
        private String title;
        private String author;

        // Getters e Setters

        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @JsonProperty("author")
        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
}
