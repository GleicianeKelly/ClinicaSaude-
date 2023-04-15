package com.api.msatendimento.service;


import com.api.msatendimento.model.Atendimento;
import com.api.msatendimento.repository.AtendimentoRepository;

//import io.swagger.model.AtendimentoRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

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
        atendimentoRepository.insert(entity);
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
