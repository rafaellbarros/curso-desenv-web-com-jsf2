package com.algaworks.cursojsf2.visao;

import com.algaworks.cursojsf2.dominio.Produto;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * ApplicationScoped - Dura enquanto aplicação estiver online e os dados são compartilhada.
 * SessionScoped - Dura a sessao por usuário e os dados não são compartilhados.
 * ViewScoped - Somente na página de visualização.
 * RequestScoped - Padrão caso não implementado outro, dura somente a requisiçaõ.
 * NoneScoped - Por demanda, inicializa quando precisa.
 */

@ManagedBean
public class GestaoProdutosBean implements Serializable {

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

    @PostConstruct
    public void inicializar() {
        System.out.println("Inializou bean");
    }

    @PreDestroy
    public void finalizar() {
        System.out.println("Finalizando bean");
    }
}
