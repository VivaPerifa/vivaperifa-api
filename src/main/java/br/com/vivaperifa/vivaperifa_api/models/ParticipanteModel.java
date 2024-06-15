package br.com.vivaperifa.vivaperifa_api.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="participante")
public class ParticipanteModel{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;

    @Column(name="nome_completo")
    private String nomeCompleto;
    
    @Column(name="data_nasc")
    private Date dataNascimento;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codigo_participante", referencedColumnName="codigo", nullable = false)
    private EnderecoModel endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="codigo_usuario", referencedColumnName="codigo", nullable = false)
    private Usuario usuario;

    @ManyToMany
    @JoinTable(
        name = "participante_interesse",
        joinColumns = @JoinColumn(name = "codigo_participante"),
        inverseJoinColumns = @JoinColumn(name = "codigo_interesse")
    )
    private List<CategoriaModel> interesses;

    public ParticipanteModel(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<CategoriaModel> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<CategoriaModel> interesses) {
        this.interesses = interesses;
    }   

    
}
