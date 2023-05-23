package com.api.msatendimento.service;


import com.api.msatendimento.model.Atendimento;
import com.api.msatendimento.repository.AtendimentoRepository;

//import io.swagger.model.AtendimentoRequest;
import io.swagger.model.AtendimentoDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AtendimentoService {

    @Autowired
    private AtendimentoRepository atendimentoRepository;
    //@Autowired
    //private VacinaFeign vacinaFeign;
   // @Autowired
    //private PacienteFeign pacienteFeign;

    public void save(Atendimento entity) {
        UUID uuid = UUID.randomUUID();
        entity.setUuid(uuid.toString());
        entity.setData(LocalDateTime.now());
        atendimentoRepository.insert(entity);
    }

    public List<Atendimento> findByAtendimento(Long idPaciente) {
        var atendimento = atendimentoRepository.findByIdPaciente(idPaciente);
        return atendimento;
    }


    /*public void save(AtendimentoRequest atendimentoRequest) {
        var vacina = vacinaFeign.findByName(atendimentoRequest.getNomeVacina());
        var paciente = pacienteFeign.findByCpf(atendimentoRequest.getCpfPaciente());
        Atendimento atendimento = new Atendimento();
        atendimento.setData(LocalDateTime.now());
        atendimento.setIdVacina(vacina.getBody().getId());
        atendimento.setIdPaciente(paciente.getBody().getId());
        atendimentoRepository.save(atendimento);
    }*/
}
