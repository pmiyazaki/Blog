package com.DigitalHouse.blog.repository;

import com.DigitalHouse.blog.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {

    //consulta pelo titulo
    public List<Postagem> findAllByTituloContainingIgnoreCase (String titulo);
}

