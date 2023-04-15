package com.api.msatendimento.mapper;

import com.api.msatendimento.model.Atendimento;

import io.swagger.model.AtendimentoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AtendimentoMapper {


  Atendimento toEntity (AtendimentoDTO atendimentoDTO);
}
