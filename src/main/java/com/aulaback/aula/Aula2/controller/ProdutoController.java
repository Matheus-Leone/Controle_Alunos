package com.aulaback.aula.Aula2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


import com.aulaback.aula.Aula2.model.Produto;



@RestController
@RequestMapping("/aula02/produto")

public class ProdutoController {

    private List<Produto> produtos = new ArrayList<>();

    public ProdutoController(){
    produtos.add(new Produto(1, "Caderno", "10 materias",10d));
    produtos.add(new Produto(2, "Caneta", "4 cores", 2.5));
    produtos.add(new Produto(3, "Notebook", "HP", 5000d));
    }

    @GetMapping
    public List<Produto> listar(){
        return produtos;
        }


   /*  
   
   @GetMapping("{id}")
   public Produto porId(@PathVariable int id){
     for (Produto p : produtos){
         if (p.getId() == id)
            return p;
          }
           return null;
        }
    
    
    @PostMapping
    public Produto gravarProduto(@RequestBody Produto produto){
    produtos.add(produto)
    return produto;
    }
    
    @DeleteMapping("{id}")
    public String excluiProduto(@PathVariableint id){
    for(Produto p : produtos){
        if (p.getId() == id){
            produtos.remove(p);
            return "Excluído com Sucesso!"
        }
    }
        return "Produto não Encontrado!";
    }
    
    @PutMapping("{id}")
    public Produto atualizaProduto(@PathVariable int id, @RequestBody Produto produto){
        for (Produto p: produtos){
            if(p.getId() == id){
                p.setNome(produto.getNome());
                p.setDescricao(produto.getDescricao());
                p.setPreco(produto.getPreco());
                return p;
            }
        }
        return null;
    }
    
    
    
    
    
    
    
        */


}
