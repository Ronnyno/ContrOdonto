/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controdonto.beans;

import com.controdonto.model.Produto;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author RONIELE OLIVEIRA
 */
@ManagedBean
@SessionScoped
public class ProdutoManagedBean {

    Produto produto = new Produto();
    ArrayList<Produto> produtos = new ArrayList<>();
    
    public ProdutoManagedBean() {
        produtos.add(produto);
    }
    
    public void salvarProduto(){
       
    }
    
    public void removerProduto(){
        
    }
    
    public void listarProduto(){
        
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    
}
