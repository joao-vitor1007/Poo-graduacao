package com.gerenciamento.estoque.Controller;


import com.gerenciamento.estoque.Dto.EmpresaDto;
import com.gerenciamento.estoque.Model.EmpresaModel;
import com.gerenciamento.estoque.Service.EmpresaService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/empresa")
public class EmpresaController {
    private final EmpresaService empresaService;
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }
    @PostMapping
    public ResponseEntity<EmpresaModel> criar(@Valid @RequestBody EmpresaDto dto){
        EmpresaModel empresaModel = empresaService.salvar(dto);
        return ResponseEntity.ok(empresaModel);
    }
    @GetMapping
    public ResponseEntity<List<EmpresaModel>> listarTodas(){
        return ResponseEntity.ok(empresaService.listarTodas());
    }
    @GetMapping("/ativas")
    public ResponseEntity<List<EmpresaModel>> listarAtivas(){
        return ResponseEntity.ok(empresaService.listarEmpresasAtivas());
    }
    @GetMapping("/{cdEmpresa}")
    public ResponseEntity<EmpresaModel> listarPorCdEmpresa(
            @PathVariable Integer cdEmpresa) {
        return empresaService.findByCdEmpresa(cdEmpresa)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());

    }


}
