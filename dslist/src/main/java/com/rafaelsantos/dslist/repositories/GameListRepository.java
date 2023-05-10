package com.rafaelsantos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafaelsantos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}