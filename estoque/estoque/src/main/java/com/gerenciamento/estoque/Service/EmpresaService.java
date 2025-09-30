package com.gerenciamento.estoque.Service;

import com.gerenciamento.estoque.Dto.EmpresaDto;
import com.gerenciamento.estoque.Model.EmpresaModel;
import com.gerenciamento.estoque.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired

    private  EmpresaRepository empresaRepository;
    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }
    public EmpresaModel salvar(EmpresaDto dto){
        EmpresaModel empresa = new EmpresaModel();
        empresa.setNmFantasia(dto.nmFantasia());
        empresa.setNuCnpj(dto.nuCnpj());
        empresa.setFlAtivo(dto.flAtivo());
        empresa.setNmRazao(dto.nmRazao());
        empresa.setDsEndereco(dto.dsEndereco());



    }
}
