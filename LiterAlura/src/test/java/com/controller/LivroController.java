package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Scanner;

@Controller
public class LivroController {
    @Autowired
    private LivroService livroService;

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu:");
            System.out.println("1. Listar todos os livros");
            System.out.println("2. Adicionar um novo livro");
            System.out.println("3. Remover um livro");
            System.out.println("4. Atualizar informações de um livro");
            System.out.println("5. Buscar livro por ID");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    List<Livro> livros = livroService.listarLivros();
                    livros.forEach(livro -> System.out.println(livro.getTitulo()));
                    break;
                case 2:
                    // Lógica para adicionar um novo livro
                    break;
                case 3:
                    // Lógica para remover um livro
                    break;
                case 4:
                    // Lógica para atualizar um livro
                    break;
                case 5:
                    // Lógica para buscar livro por ID
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private class LivroService {
        public List<Livro> listarLivros() {
                return null;
        }
    }

    private class Livro {
        public boolean getTitulo() {

            return false;
        }
    }
}