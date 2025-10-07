package com.gerenciamento.estoque.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBEMPRESA")

public class EmpresaModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CDEEMPRESA")
    private Integer cdEmpresa;
    @Column(name = "NMRAZAO", length = 100, nullable = false)
    private String nmRazao;
   @Column(name = "NMFANTASIA", length = 50, nullable = false)
    private String nmFantasia;
   @Column(name = "NUCNPJ", length = 20, nullable = false)
    private String nuCnpj;
   @Column(name = "NUTELEFONE", length = 14)
    private String nuTelefone;
   @Column(name = "DSENDERECO", length = 50)
    private String dsEndereco;
   @Column(name = "FLATIVO", length = 1, nullable = false)
    private String flAtivo;
// teste

}
