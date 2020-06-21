package com.algaworks.cursojsf2.visao;

import com.algaworks.cursojsf2.dominio.Produto;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@ManagedBean
@SessionScoped
public class GestaoProdutosBean implements Serializable {

    private List<Produto> produtos;
    private Produto produto;

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

    public void incluir() {
        this.produtos.add(this.produto);
        this.produto = new Produto();
    }

    public Produto getProduto() {
        return produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

}
