package br.org.serratec.h2banco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import br.org.serratec.h2banco.domain.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

}
