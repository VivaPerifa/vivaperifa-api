package br.com.vivaperifa.vivaperifa_api.models;

import java.util.Date;

public class PessoaFisica extends OrganizadorModel{
    private String nome;
    private String cpf;
    private Date dataNasc;

    public PessoaFisica(){
        super();
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    } 
}
