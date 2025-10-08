package com.gerenciamento.estoque.Service;

import com.gerenciamento.estoque.Dto.EmpresaDto;
import com.gerenciamento.estoque.Model.EmpresaModel;
import com.gerenciamento.estoque.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        return empresaRepository.save(empresa);

    }
    public List<EmpresaModel> listarTodas(){
        return empresaRepository.findAll();
    }
    public List<EmpresaModel> listarEmpresasAtivas(){
        return empresaRepository.findAllByFlativo();
    }
    public Optional<EmpresaModel> findByCdEmpresa(Integer cdEmpresa){
        return empresaRepository.findByCdEmpresa(cdEmpresa);
    }
    public Optional<EmpresaModel> findByNuCnpj(Integer nuCnpj){
        return empresaRepository.findByNuCnpj(nuCnpj);
    }
    public Optional<EmpresaModel> atualizarDados(Integer cdEmpresa, EmpresaDto empresaDto){
        return empresaRepository.findByCdEmpresa(cdEmpresa).map( empresa ->
        {   empresa.setNuCnpj(empresaDto.nuCnpj());
            empresa.setDsEndereco(empresaDto.dsEndereco());
            empresa.setNmFantasia(empresaDto.nmFantasia());
            empresa.setNmRazao(empresaDto.nmRazao());
            empresa.setNuTelefone(empresaDto.nuTelefone());
            empresa.setFlAtivo(empresaDto.flAtivo());
            return empresaRepository.save(empresa);

        });
    }
    public void deletarEmpresa(Integer cdEmpresa){
        empresaRepository.deleteById(cdEmpresa);
    }
}
