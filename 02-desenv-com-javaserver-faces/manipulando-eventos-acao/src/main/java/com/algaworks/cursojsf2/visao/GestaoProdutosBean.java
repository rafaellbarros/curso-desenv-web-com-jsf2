package com.algaworks.cursojsf2.visao;

import com.algaworks.cursojsf2.dominio.Produto;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
@SessionScoped
public class GestaoProdutosBean implements Serializable {

    private List<Produto> produtos;
    private Produto produto;

    private Produto produtoSelecionado;

    public GestaoProdutosBean() {
        this.produtos = new ArrayList<>();
        this.produto = new Produto();
    }

    public String obterAjuda() {
        if (this.produtos.isEmpty()) {
            return "AjudaGestaoProdutos?faces-redirect=true";
        }
        return "AjudaGestaoProdutosTelefone?faces-redirect=true";
    }

    public void verificarInclusao(ActionEvent event) {
        System.out.println("verificando...");
        if ("".equals(this.produto.getFabricante())) {
            this.produto.setFabricante("Sem fabricante");
        }
    }

    public void incluir() {
        System.out.println("incluindo...");
        this.produtos.add(this.produto);
        this.produto = new Produto();
    }

    public void excluir() {
        this.produtos.remove(this.produtoSelecionado);
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public Produto getProdutoSelecionado() {
        return produtoSelecionado;
    }

    public void setProdutoSelecionado(Produto produtoSelecionado) {
        this.produtoSelecionado = produtoSelecionado;
    }
}
