package br.com.vivaperifa.vivaperifa_backend.models;

import org.springframework.data.annotation.Id;

public class Usuario {
    @Id
    private String id;
    private String email;
    private String senha;
    private String telefone;
    private String status; //ativo/inativo
    private int reputacaoComunidade;

    public Usuario(){

    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getReputacaoComunidade() {
        return reputacaoComunidade;
    }

    public void setReputacaoComunidade(int reputacaoComunidade) {
        this.reputacaoComunidade = reputacaoComunidade;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
