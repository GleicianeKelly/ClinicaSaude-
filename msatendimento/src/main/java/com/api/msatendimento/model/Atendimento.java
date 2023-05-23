package com.api.msatendimento.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;
@Document(collection = "atendimento")
public class Atendimento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String uuid;
    private Long idPaciente;
    private Long idVacina;
    private LocalDateTime data;

    public Atendimento() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Long getIdVacina() {
        return idVacina;
    }

    public void setIdVacina(Long idVacina) {
        this.idVacina = idVacina;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
