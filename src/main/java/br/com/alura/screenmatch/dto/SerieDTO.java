package br.com.alura.screenmatch.dto;

import br.com.alura.screenmatch.model.Categoria;

import java.util.UUID;

public record SerieDTO(

         UUID id,
         String titulo,
         Integer totalTemporadas,
         Double avaliacao,
         Categoria genero,
         String atores,
         String poster,
         String sinopse) {
}
