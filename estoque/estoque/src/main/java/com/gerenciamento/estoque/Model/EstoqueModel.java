package com.gerenciamento.estoque.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "TBESTOQUE")
public class EstoqueModel {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cdEstoque")
    private Long id;

    @Column(name = "cdLocalEstoque", length = 20, nullable = false)
    private int cdLocalEstoque;

    @Column(name = "qtEstoque", length = 20, nullable = false)
    private int qtEstoque;

    @Column(name = "flAtivo", length = 1, nullable = false)
    private String flAtivo;


}
