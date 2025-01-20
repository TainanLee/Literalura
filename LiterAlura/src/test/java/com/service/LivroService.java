package com.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    public Livro adicionarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public void removerLivro(Long id) {
        livroRepository.deleteById(id);
    }

    public Livro atualizarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro buscarLivroPorId(Long id) {
        return (Livro) livroRepository.findById(id).orElse(null);
    }

    private class LivroRepository {
        public Livro save(Livro livro) {
            return null;
        }

        public void deleteById(Long id) {

        }

        public Optional<Object> findById(Long id) {


            return Optional.empty();
        }

        public List<Livro> findAll() {

            return null;
        }
    }

    private class Livro {
    }
}