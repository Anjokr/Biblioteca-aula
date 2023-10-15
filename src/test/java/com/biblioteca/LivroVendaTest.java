package com.biblioteca;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LivroVendaTest {

    @Test
    public void testConstrutorComParametros() {
        LivroEstoque livroEstoque = new LivroEstoque(new Livro(), 100, 300);
    int quantidade = 12;
    LivroVenda livroVenda = new LivroVenda(livroEstoque, quantidade);
        Assert.assertNotNull(livroVenda.livroDoEstoque);
        Assert.assertNotNull(livroVenda.quantidade);
        Assert.assertEquals(12, quantidade);
    }
    
    @Test
    public void testIncrementarQuantidadeSemParametros() {
        LivroVenda livroVenda = new LivroVenda();
        livroVenda.IncrementarQuantidade();

        Assert.assertEquals(1, livroVenda.quantidade);
    }

    @Test
    public void testIncrementarQuantidadeComParametros() {
        LivroVenda livroVenda = new LivroVenda();
        livroVenda.IncrementarQuantidade(5);

        Assert.assertEquals(5, livroVenda.quantidade);
    }

    @Test
    public void testDecrementarQuantidadeSemParametrosSemQuantidade() {
        LivroVenda livroVenda = new LivroVenda();

        Assert.assertFalse(livroVenda.DecrementarQuantidade());
    }

    @Test
    public void testDecrementarQuantidadeSemParametrosComQuantidade() {
        LivroEstoque livroEstoque = new LivroEstoque(new Livro(), 100, 300);
        int quantidade = 12;
        LivroVenda livroVenda = new LivroVenda(livroEstoque, quantidade);
        Assert.assertTrue(livroVenda.DecrementarQuantidade());
    }

    @Test
    public void testDecrementarQuantidadeComParametrosMenorQuantidade() {
        LivroEstoque livroEstoque = new LivroEstoque(new Livro(), 100, 300);
        int quantidade = 10;
        LivroVenda livroVenda = new LivroVenda(livroEstoque, quantidade);

        Assert.assertFalse(livroVenda.DecrementarQuantidade(11));
    }

    @Test
    public void testDecrementarQuantidadeComParametrosMaiorIgualQuantidade() {
        LivroEstoque livroEstoque = new LivroEstoque(new Livro(), 100, 300);
        int quantidade = 10;
        LivroVenda livroVenda = new LivroVenda(livroEstoque, quantidade);
        Assert.assertTrue(livroVenda.DecrementarQuantidade(9));
    }
}
