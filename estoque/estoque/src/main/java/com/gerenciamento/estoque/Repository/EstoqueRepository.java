package com.gerenciamento.estoque.Repository;

import com.gerenciamento.estoque.Model.EstoqueModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EstoqueRepository extends JpaRepository<EstoqueModel, Integer> {

    Optional<EstoqueModel> findByCdEstoque(Integer cdEstoque);
    Optional<EstoqueModel> findCdLocalEstoque(Integer findCdLocalEstoque);
    @Query("SELECT est FROM EstoqueModel est WHERE est.flAtivo = 'S'")
    List<EstoqueModel> findAllEstoque();
    @Transactional
    Optional<EstoqueModel> deleteByCdEstoque(Integer cdEstoque);

    @Override
    List<EstoqueModel> findAll();

    Optional<EstoqueModel> findByNuCnpj(Optional<EstoqueModel> byNuCnpj);


}
