package com.example.pokedexapi.repository;


import com.example.pokedexapi.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{


}
