package br.com.vivaperifa.vivaperifa_api.models;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="publicacao")
@Inheritance(strategy = InheritanceType.JOINED)
public class PublicacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String data;
    private String hora;
    private int curtidas;
    private int cliques;
    private int salvos;
    private double notaAvaliacao;
    private int quantidadeAvaliacao;
    private String visibilidade;

    @OneToMany
    @JoinColumn(name = "codigo_publicacao", referencedColumnName = "codigo")
    private List<ComentarioModel> comentarios;

    public PublicacaoModel(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getCliques() {
        return cliques;
    }

    public void setCliques(int cliques) {
        this.cliques = cliques;
    }

    public int getSalvos() {
        return salvos;
    }

    public void setSalvos(int salvos) {
        this.salvos = salvos;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public int getQuantidadeAvaliacao() {
        return quantidadeAvaliacao;
    }

    public void setQuantidadeAvaliacao(int quantidadeAvaliacao) {
        this.quantidadeAvaliacao = quantidadeAvaliacao;
    }

    public String getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(String visibilidade) {
        this.visibilidade = visibilidade;
    }

    public List<ComentarioModel> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<ComentarioModel> comentarios) {
        this.comentarios = comentarios;
    }
}
