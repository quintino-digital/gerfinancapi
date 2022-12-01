package digital.quintino.gerfinancapi.model;

import javax.persistence.*;

@Entity
@Table(name = "TB_FUNCAO_CARTAO_BANCARIO")
public class FuncaoCartaoBancarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    private Long codigo;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    public FuncaoCartaoBancarioModel() { }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
