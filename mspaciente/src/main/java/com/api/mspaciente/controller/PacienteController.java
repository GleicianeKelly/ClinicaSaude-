package com.api.mspaciente.controller;

import com.api.mspaciente.mapper.PacienteMapper;
import com.api.mspaciente.service.PacienteService;
import io.swagger.api.PacienteApi;
import io.swagger.model.PacienteDTO;
import io.swagger.model.PacienteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacienteController implements PacienteApi {

    @Autowired
    private PacienteService pacienteService;

    @Autowired
    private PacienteMapper pacienteMapper;

    @Override
    public ResponseEntity<PacienteDTO> findByCpf(String cpf){
        PacienteDTO paciente = pacienteMapper.toDTO(pacienteService.findByCpf(cpf));
        return ResponseEntity.ok().body(paciente);
    }
    @Override
    public ResponseEntity<Void> save(PacienteRequest pacienteRequest){
        pacienteService.save(pacienteRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @Override
    public ResponseEntity<String> deleteByCpf(String cpf) {
       pacienteService.delete(cpf);
       return ResponseEntity.ok("Registro de cpf: " + cpf + " foi deletado com sucesso!");
    }

    @Override
    public ResponseEntity<PacienteDTO> updatePaciente(String cpf,PacienteDTO paciente) {
        PacienteDTO pacienteAlterado = pacienteMapper.toDTO(pacienteService.update(cpf, paciente));
        return ResponseEntity.ok(pacienteAlterado);
    }


}
