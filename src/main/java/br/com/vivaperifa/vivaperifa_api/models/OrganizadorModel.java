package br.com.vivaperifa.vivaperifa_api.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.criteria.JoinType;

@Entity
@Table(name="organizador")
@Inheritance(strategy = InheritanceType.JOINED)
public class OrganizadorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String descricaoPerfil;

    @ManyToOne
    @JoinColumn(name = "codigo_plano", referencedColumnName = "codigo")
    private PlanoModel plano;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_usuario", referencedColumnName = "codigo", nullable = false)
    private UsuarioModel usuario;

    @ElementCollection
    @CollectionTable(name = "rede_social", joinColumns = @JoinColumn(name = "codigo_organizador"))
    @Column(name = "rede_social")
    private List<String> redeSocial;

    public OrganizadorModel(){

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }

    public PlanoModel getPlano() {
        return plano;
    }

    public void setPlano(PlanoModel plano) {
        this.plano = plano;
    }

    public UsuarioModel getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioModel usuario) {
        this.usuario = usuario;
    }

    public List<String> getRedeSocial() {
        return redeSocial;
    }

    public void setRedeSocial(List<String> redeSocial) {
        this.redeSocial = redeSocial;
    }

     
}
