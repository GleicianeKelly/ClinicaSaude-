package com.api.msatendimento.mapper;

import com.api.msatendimento.model.Atendimento;

import io.swagger.model.AtendimentoDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AtendimentoMapper {


  Atendimento toEntity (AtendimentoDTO atendimentoDTO);

  AtendimentoDTO toDTO(Atendimento atendimento);

  List<AtendimentoDTO> toDTO(List<Atendimento> atendimento);
}
