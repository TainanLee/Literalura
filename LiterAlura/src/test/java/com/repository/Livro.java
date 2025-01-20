package com.repository;


import com.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

interface LivroRepository extends JpaRepository<Livro, Long> {
    // Métodos de consulta personalizados, se necessário
}