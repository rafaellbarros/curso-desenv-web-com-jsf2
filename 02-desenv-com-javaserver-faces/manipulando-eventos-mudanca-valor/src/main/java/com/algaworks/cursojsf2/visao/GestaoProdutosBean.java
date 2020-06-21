package com.algaworks.cursojsf2.visao;

import com.algaworks.cursojsf2.dominio.Produto;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
@SessionScoped
public class GestaoProdutosBean implements Serializable {

    private String nomePesquisa;
    private List<Produto> produtos;
    private List<Produto> produtosFiltrados;
    private Produto produto;

    private Produto produtoSelecionado;

    public GestaoProdutosBean() {
        this.produtos = new ArrayList<>();
        this.produtosFiltrados = new ArrayList<>();
        this.produto = new Produto();
    }

    public void pesquisar() {
        System.out.println("Pesquisar...");
    }
    public void fabricantePesquisaAlterado(ValueChangeEvent event) {
        System.out.println("Evento de mudança de valor...");

        System.out.println("Valor atual: " + this.nomePesquisa);
        System.out.println("Novo valor: " + event.getNewValue());

        this.produtosFiltrados.clear();

        for (Produto produto: this.produtos) {
            if (produto.getNome() != null && produto.getNome().toLowerCase()
                    .startsWith(event.getNewValue().toString().toLowerCase())) {
                this.produtosFiltrados.add(produto);
            }
        }
    }

    public void incluir() {
        this.produtos.add(this.produto);
        this.produto = new Produto();
    }

    public void excluir() {
        this.produtos.remove(this.produtoSelecionado);
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Produto> getProdutosFiltrados() {
        return produtosFiltrados;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getNomePesquisa() {
        return nomePesquisa;
    }

    public void setNomePesquisa(String nomePesquisa) {
        this.nomePesquisa = nomePesquisa;
    }

    public Produto getProdutoSelecionado() {
        return produtoSelecionado;
    }

    public void setProdutoSelecionado(Produto produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }
}
