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
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="evento")
public class EventoModel extends PublicacaoModel{
    //detalhes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    private String titulo;
    private String caminhoImagem;
    private String descricao;
    private String faixaEtaria;
    private String localVendaIngresso;

    @ManyToOne
    @JoinColumn(name = "codigo_categoria", referencedColumnName = "codigo", nullable = false)
    private CategoriaModel categoria;

    @ManyToOne
    @JoinColumn(name = "codigo_organizador", referencedColumnName = "codigo", nullable = false)
    private OrganizadorModel organizador;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_evento", referencedColumnName = "codigo", nullable = false)
    private List<ProgramacaoModel> programacao;

    public EventoModel(){
        super();
    }

    public void adicionarItemProgramacao(ProgramacaoModel item){
        programacao.add(item);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getLocalVendaIngresso() {
        return localVendaIngresso;
    }

    public void setLocalVendaIngresso(String localVendaIngresso) {
        this.localVendaIngresso = localVendaIngresso;
    }

    public CategoriaModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }

    public OrganizadorModel getOrganizador() {
        return organizador;
    }

    public void setOrganizador(OrganizadorModel organizador) {
        this.organizador = organizador;
    }

    public List<ProgramacaoModel> getProgramacao() {
        return programacao;
    }

    public void setProgramacao(List<ProgramacaoModel> programacao) {
        this.programacao = programacao;
    }
}
