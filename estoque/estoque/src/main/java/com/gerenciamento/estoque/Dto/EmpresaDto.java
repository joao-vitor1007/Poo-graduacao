package com.gerenciamento.estoque.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record EmpresaDto(
        String nmFantasia,
        @NotBlank(message = "Não é possível salvar uma empresa sem um cnpj")
        String nuCnpj,
        String nuTelefone,
        @NotBlank(message = "Não é possível salvar uma empresa sem um endereço")
        String dsEndereco,
        @NotBlank(message = "Não é possível salvar uma empresa sem um nome de razão")
        String nmRazao,
        String cdEmpresa,
        @Pattern(regexp = "^S|N$", message = "Só é possível salvar a empresa "+
                "com 'S' ou 'N' para indicar o status")
        String flAtivo) {



}
