package com.gerenciamento.estoque.Service;

import com.gerenciamento.estoque.Dto.EstoqueDto;
import com.gerenciamento.estoque.Model.EstoqueModel;
import com.gerenciamento.estoque.Repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository estoqueRepository;

    public EstoqueService(EstoqueRepository estoqueRepository) {
        this.estoqueRepository = estoqueRepository;
    }

    public EstoqueModel salvar(EstoqueDto dto) {
        EstoqueModel estoque = new EstoqueModel();

        estoque.setCdLocalEstoque(dto.cdLocalEstoque());
        estoque.setQtEstoque(dto.qtEstoque());
        estoque.setFlAtivo(dto.flAtivo());
        return estoqueRepository.save(estoque);
    }

    public List<EstoqueModel> findAll() {
        return estoqueRepository.findAll();
    }

}
