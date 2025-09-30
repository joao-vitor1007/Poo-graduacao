package com.gerenciamento.estoque.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBEMPRESA")
public class EstoqueModel {
    @Id


    private String nmFantasia;
    private String nuCnpj;
    private String nuTelefone;
    private String dsEndereco;
    private String flAtivo;
    private String nmRazao;
    private Integer cdEmpresa;
}
