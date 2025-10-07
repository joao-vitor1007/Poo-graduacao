package com.gerenciamento.estoque.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Table(name = "TBEMPRESA")
public class EstoqueModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String nmFantasia;
    private String nuCnpj;
    private String nuTelefone;
    private String dsEndereco;
    private String flAtivo;
    private String nmRazao;
    private Integer cdEmpresa;
}
