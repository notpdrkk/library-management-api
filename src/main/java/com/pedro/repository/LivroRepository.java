package com.pedro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedro.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
