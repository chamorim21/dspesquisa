package com.amorim.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amorim.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
