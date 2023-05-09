package com.rafaelsantos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
