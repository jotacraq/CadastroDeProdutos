package dev.jotacraq.CadastroDeProdutos.Produtos;

import dev.jotacraq.CadastroDeProdutos.Entregas.EntregasModel;
import jakarta.persistence.*;

import java.util.List;


// Entity ele transforma uma classe em uma entidade do BD.
@Entity
@Table(name = "tb_cadastro")
public class ProdutoModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String marca;
    private String serie;
    private float preco;
    private String tipo;

    // Muitos produto podem ter uma só entrega
    @ManyToOne
    @JoinColumn(name = "entregas_id") // Foreign Key (Chave Estrangeira)
    private List<EntregasModel> entregas;

    public ProdutoModel() {
    }

    public ProdutoModel(String modelo, String marca, String serie, float preco, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.serie = serie;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
