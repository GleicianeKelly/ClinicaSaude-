/*package com.api.msatendimento.repository.feign;

import com.api.msatendimento.model.DTO.VacinaDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${api.vacinaUrl}", name = "vacinaFeign")
public interface VacinaFeign {


    @GetMapping("vacina/{nome}")
    ResponseEntity<VacinaDTO> findByName(@PathVariable("nome") String nome);
}*/
