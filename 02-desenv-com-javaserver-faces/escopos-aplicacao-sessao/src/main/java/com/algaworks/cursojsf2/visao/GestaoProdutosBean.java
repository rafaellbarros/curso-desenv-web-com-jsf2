package com.algaworks.cursojsf2.visao;

import com.algaworks.cursojsf2.dominio.Produto;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
// @ApplicationScoped
@SessionScoped
public class GestaoProdutosBean {

    private List<Produto> produtos;
    private Produto produto;

    public GestaoProdutosBean() {
        this.produtos = new ArrayList<>();
        this.produto = new Produto();
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
