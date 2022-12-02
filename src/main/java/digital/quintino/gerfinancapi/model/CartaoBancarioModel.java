package digital.quintino.gerfinancapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CARTAO_BANCARIO")
public class CartaoBancarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    private Long codigo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CATEGORIA_CARTAO_BANCARIO")
    private CategoriaCartaoBancarioModel categoriaCartaoBancarioModel;

    @OneToOne
    @JoinColumn(name = "ID_BANDEIRA_CARTAO_BANCARIO")
    private BandeiraCartaoBancarioModel bandeiraCartaoBancarioModel;

    @ManyToOne
    @JoinColumn(name = "ID_FUNCAO_CARTAO_BANCARIO")
    private FuncaoCartaoBancarioModel funcaoCartaoBancarioModel;

    @Column(name = "NUMERO", nullable = false)
    private String numero;

    @Column(name = "NOME_IMPRESSO", nullable = false)
    private String nomeImpresso;

    @Column(name = "DATA_VALIDADE", nullable = false)
    private Date dataValidade;

    @Column(name = "DATA_CANCELAMENTO")
    private Date dataCancelamento;

    @Column(name = "E_APROXIMACAO")
    private Boolean eAproximacao;

    public CartaoBancarioModel() { }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public CategoriaCartaoBancarioModel getCategoriaCartaoBancarioModel() {
        return categoriaCartaoBancarioModel;
    }

    public void setCategoriaCartaoBancarioModel(CategoriaCartaoBancarioModel categoriaCartaoBancarioModel) {
        this.categoriaCartaoBancarioModel = categoriaCartaoBancarioModel;
    }

    public BandeiraCartaoBancarioModel getBandeiraCartaoBancarioModel() {
        return bandeiraCartaoBancarioModel;
    }

    public void setBandeiraCartaoBancarioModel(BandeiraCartaoBancarioModel bandeiraCartaoBancarioModel) {
        this.bandeiraCartaoBancarioModel = bandeiraCartaoBancarioModel;
    }

    public FuncaoCartaoBancarioModel getFuncaoCartaoBancarioModel() {
        return funcaoCartaoBancarioModel;
    }

    public void setFuncaoCartaoBancarioModel(FuncaoCartaoBancarioModel funcaoCartaoBancarioModel) {
        this.funcaoCartaoBancarioModel = funcaoCartaoBancarioModel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeImpresso() {
        return nomeImpresso;
    }

    public void setNomeImpresso(String nomeImpresso) {
        this.nomeImpresso = nomeImpresso;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Date getDataCancelamento() {
        return dataCancelamento;
    }

    public void setDataCancelamento(Date dataCancelamento) {
        this.dataCancelamento = dataCancelamento;
    }

    public Boolean geteAproximacao() {
        return eAproximacao;
    }

    public void seteAproximacao(Boolean eAproximacao) {
        this.eAproximacao = eAproximacao;
    }

}
