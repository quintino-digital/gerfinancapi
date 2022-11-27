package digital.quintino.gerfinancapi.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TB_CARTAO_BANCARIO")
public class CartaoBancarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    private Long codigo;

    private String numero;

    private String codigoSeguranca;

    private String nomeImpresso;

    private Date dataValidade;

    private Date dataCancelamento;

    private Boolean eAproximacao;

    public CartaoBancarioModel() { }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(String codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
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
