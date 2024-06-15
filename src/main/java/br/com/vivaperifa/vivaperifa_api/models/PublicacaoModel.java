package br.com.vivaperifa.vivaperifa_api.models;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="publicacao")
public class PublicacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private Date data;
    private Date hora;
    private int curtidas;
    private int cliques;
    private int salvos;
    private double notaAvaliacao;
    private int quantidadeAvaliacao;
    private String visibilidade;

    @OneToMany
    @JoinColumn(name = "codigo_publicacao", referencedColumnName = "codigo")
    private List<ComentarioModel> comentarios;

    @OneToOne
    @JoinColumn(name = "codigo_evento", referencedColumnName = "codigo")
    private EventoModel evento;

    public PublicacaoModel(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
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

    public EventoModel getEvento() {
        return evento;
    }

    public void setEvento(EventoModel evento) {
        this.evento = evento;
    }

    
}
