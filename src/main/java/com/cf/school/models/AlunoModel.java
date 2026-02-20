package com.cf.school.models;

import jakarta.persistence.*;

@Entity // cria entidade no banco
@Table(name = "TBL_ALUNO") // muda ou adiciona o nome personalization da tabela
public class AlunoModel {

    // define que a variavel e'o id/ chave primaria e o auto-incrementa
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String email;

    public AlunoModel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
