package com.example.pokedexapi.controller;

import com.example.pokedexapi.model.Pokemon;
import com.example.pokedexapi.service.PokemonService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    @Autowired
    private PokemonService service; // Agora injetamos o Service e não o Repository

    @GetMapping
    public List<Pokemon> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Pokemon buscar(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public Pokemon criar(@Valid @RequestBody Pokemon pokemon) {
        return service.salvar(pokemon);
    }

    @PutMapping("/{id}")
    public Pokemon editar(@PathVariable Long id, @Valid @RequestBody Pokemon pokemon) {
        return service.atualizar(id, pokemon);
    }

    @DeleteMapping("/{id}")
    public void remover(@PathVariable Long id) {
        service.deletar(id);
    }
}