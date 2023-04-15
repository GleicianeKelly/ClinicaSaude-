package com.api.mspaciente.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String cpf;

    @NotBlank
    @Column(name= "endereco_paciente")
    private String endereco;

    @NotBlank
    @Column(name = "nome_paciente")
    private String nomePaciente;

    public Paciente(Long id, String cpf, String endereco, String nomePaciente) {
        this.id = id;
        this.cpf = cpf;
        this.endereco = endereco;
        this.nomePaciente = nomePaciente;
    }

    public Paciente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }
}
