package dev.jotacraq.CadastroDeProdutos.Entregas;

import dev.jotacraq.CadastroDeProdutos.Produtos.ProdutoModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_entrega")
public class EntregasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cidade;
    private String bairro;
    
    // Um produto pode estar em várias entregas
    @OneToMany(mappedBy = "entregas")
    private ProdutoModel produto;

    public EntregasModel(String cidade, String bairro, ProdutoModel produto) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.produto = produto;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}
