package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class ControlApi {

    @RestController
    public class BookController {

        private final CatologoLivroApi.BookService bookService;

        public BookController(BookService bookService, CatologoLivroApi.BookService bookService1) {
            this.bookService = bookService1;
            BookService bookService2 = new BookService();
        }

        @GetMapping("/api/books")
        public String fetchBooks() {
            try {
                return bookService.getBooks(); // Chama o serviço para obter os livros
            } catch (Exception e) {
                return "Erro ao buscar livros: " + e.getMessage();
            }
        }

        private class BookService {
        }
    }
}
