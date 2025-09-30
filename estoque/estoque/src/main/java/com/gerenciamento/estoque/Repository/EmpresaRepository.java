package com.gerenciamento.estoque.Repository;

import com.gerenciamento.estoque.Model.EmpresaModel;
import jakarta.transaction.Transaction;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface EmpresaRepository extends JpaRepository<EmpresaModel, Integer> {

    Optional<EmpresaModel> findByCdEmpresa(Integer cdEmpresa);
    Optional<EmpresaModel> findByNuEmpresa(Integer nuEmpresa);
    @Query("SELECT emp FROM EmpresaModel emp WHERE emp.flAtivo = 's' ")
    List<EmpresaModel> findAllFlativo();

    @Transactional
    Optional<EmpresaModel> deleteByCdEmpresa(Integer cdEmpresa);



}
