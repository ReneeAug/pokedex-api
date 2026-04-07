package com.example.pokedexapi.service;

import com.example.pokedexapi.model.Pokemon;
import com.example.pokedexapi.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PokemonService {

    @Autowired
    private PokemonRepository repository;

    // Lógica para listar todos
    public List<Pokemon> listarTodos() {
        return repository.findAll();
    }

    // Lógica para buscar um único Pokémon (com tratamento de erro!)
    public Pokemon buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Pokémon não encontrado com o ID: " + id));
    }

    // Lógica para salvar (com uma pequena regra de negócio)
    public Pokemon salvar(Pokemon pokemon) {
        // Exemplo: Sempre salvar o nome em letras maiúsculas para padronizar o banco
        pokemon.setNome(pokemon.getNome().toUpperCase());
        return repository.save(pokemon);
    }

    // Lógica para atualizar
    public Pokemon atualizar(Long id, Pokemon novosDados) {
        Pokemon pokemonExistente = buscarPorId(id); // Reutiliza a busca que já trata erro

        pokemonExistente.setNome(novosDados.getNome());
        pokemonExistente.setTipo(novosDados.getTipo());
        pokemonExistente.setNivel(novosDados.getNivel());
        pokemonExistente.setDescricao(novosDados.getDescricao());

        return repository.save(pokemonExistente);
    }

    // Lógica para deletar
    public void deletar(Long id) {
        Pokemon pokemon = buscarPorId(id);
        repository.delete(pokemon);
    }
}