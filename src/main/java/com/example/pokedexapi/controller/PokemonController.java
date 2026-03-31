package com.example.pokedexapi.controller;
import com.example.pokedexapi.model.Pokemon;
import com.example.pokedexapi.repository.PokemonRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {
    @Autowired
    private PokemonRepository repository;

    @GetMapping
    public List<Pokemon> listar(){
        return repository.findAll();
    }
    @PostMapping
    public Pokemon salvar(@RequestBody Pokemon pokemon){
        return repository.save(pokemon);


    }
    // Buscar um único Pokémon pelo ID (ex: /pokemons/1)
    @GetMapping("/{id}")
    public Optional<Pokemon> buscarPorId(@PathVariable Long id) {
        return repository.findById(id);
    }

    // Editar um Pokémon que já existe
    @PutMapping("/{id}")
    public Pokemon atualizar(@PathVariable Long id, @RequestBody Pokemon dadosNovos) {
        return repository.findById(id)
                .map(pokemon -> {
                    pokemon.setNome(dadosNovos.getNome());
                    pokemon.setTipo(dadosNovos.getTipo());
                    pokemon.setNivel(dadosNovos.getNivel());
                    return repository.save(pokemon);
                }).orElseThrow(() -> new RuntimeException("Pokémon não encontrado"));
    }

    // Excluir um Pokémon
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}


