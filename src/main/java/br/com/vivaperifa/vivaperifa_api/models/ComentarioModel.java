package br.com.vivaperifa.vivaperifa_api.models;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="comentario")
public class ComentarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String descricao;
    private Date data;
    private Date horario;
    private double notaAvaliacao;
    private int curtidas;

    @ManyToOne
    @JoinColumn(name = "codigo_participante", referencedColumnName = "codigo", nullable = false)
    private ParticipanteModel participante;

    public ComentarioModel(){
        // SimpleDateFormat formatData = new SimpleDateFormat("dd/mm/yyyy");
        // SimpleDateFormat formatTime = new SimpleDateFormat("hh:mm:ss");

        // formatData.format(data);
        // formatTime.format(horario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public ParticipanteModel getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteModel participante) {
        this.participante = participante;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    
}
