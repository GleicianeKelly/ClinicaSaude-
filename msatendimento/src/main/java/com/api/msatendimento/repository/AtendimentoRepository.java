package com.api.msatendimento.repository;

import com.api.msatendimento.model.Atendimento;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtendimentoRepository extends MongoRepository<Atendimento, Long> {


    List<Atendimento> findByIdPaciente(Long idPaciente);
}
