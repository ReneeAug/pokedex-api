package com.example.pokedexapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do Pokémon não pode ser vazio")
    private String nome;

    @NotBlank(message = "O tipo (ex: Fogo, Água) é obrigatório")
    private String tipo;

    @NotNull(message = "O nível deve ser preenchido")
    @Min(value = 1, message = "O nível mínimo permitido é 1")
    private Integer nivel; // Mudamos de String para Integer!

    private String descricao;
}