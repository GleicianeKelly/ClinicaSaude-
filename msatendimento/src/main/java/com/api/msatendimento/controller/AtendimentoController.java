package com.api.msatendimento.controller;

import com.api.msatendimento.mapper.AtendimentoMapper;
import com.api.msatendimento.service.AtendimentoService;
import io.swagger.api.AtendimentoApi;
import io.swagger.model.AtendimentoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AtendimentoController implements AtendimentoApi {

    @Autowired
    private  AtendimentoService atendimentoService;

    @Autowired
    private  AtendimentoMapper atendimentoMapper;

    @Override
    public ResponseEntity<Void> save(AtendimentoDTO atendimentoDTO){
       atendimentoService.save(atendimentoMapper.toEntity(atendimentoDTO));
       return ResponseEntity.ok().build();
    }
}
