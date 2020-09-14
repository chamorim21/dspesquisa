package com.amorim.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amorim.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
