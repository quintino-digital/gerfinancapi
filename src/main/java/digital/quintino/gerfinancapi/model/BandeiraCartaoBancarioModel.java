package digital.quintino.gerfinancapi.model;

import javax.persistence.*;

@Entity
@Table(name = "TB_BANDEIRA_CARTAO_BANCARIO")
public class BandeiraCartaoBancarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODIGO", nullable = false)
    private Long codigo;

    private String descricao;

    public BandeiraCartaoBancarioModel() { }

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
