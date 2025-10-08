package com.gerenciamento.estoque.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EstoqueDto(
        @NotBlank(message = "Código de estoque é obriatório")
        int cdEstoque,
        @NotBlank(message = "Código de endereço de estoque é obriatório")
        int cdLocalEstoque,
        @NotBlank(message = "Quantidade de estoque é obriatório")
        int qtEstoque,

        @Pattern(regexp = "^S|N$", message = "Só é possível salvar o estoque "+
                "com 'S' ou 'N' para indicar o status")
        String flAtivo) {



}