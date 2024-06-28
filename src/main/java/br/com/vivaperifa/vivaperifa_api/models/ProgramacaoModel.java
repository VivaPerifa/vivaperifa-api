package br.com.vivaperifa.vivaperifa_api.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="programacao")
public class ProgramacaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_data", referencedColumnName = "codigo", nullable = false)
    private DataEventoModel data;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_localizacao", referencedColumnName = "codigo", nullable = false)
    private LocalizacaoModel localizacao;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_programacao", referencedColumnName = "codigo", nullable = false)
    private List<HorarioEventoModel> horarios;

    public ProgramacaoModel(){

    }

    public void adicionarHorario(HorarioEventoModel horario){
        horarios.add(horario);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public DataEventoModel getData() {
        return data;
    }

    public void setData(DataEventoModel data) {
        this.data = data;
    }

    public LocalizacaoModel getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(LocalizacaoModel localizacao) {
        this.localizacao = localizacao;
    }

    public List<HorarioEventoModel> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<HorarioEventoModel> horarios) {
        this.horarios = horarios;
    }

    
}
