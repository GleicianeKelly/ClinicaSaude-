/*package com.api.msatendimento.repository.feign;

import com.api.msatendimento.model.DTO.PacienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "${api.pacienteUrl}", name = "pacienteFeign")
public interface PacienteFeign {

     @GetMapping("/paciente")
     ResponseEntity<PacienteDTO> findByCpf(@RequestHeader(value="cpf", required=true) String cpf);
}*/
