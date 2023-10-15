package com.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class VendaTest {
    @Test
    public void testConstrutorComParametros() {
        String nomeCliente = "Joao";
        String formaPagamento = "Debito";
        double valorDado = 30.4;
        LivroVenda lv= new LivroVenda();
        List<LivroVenda> livros = new ArrayList<>();
        livros.add(lv);

        Venda venda = new Venda(nomeCliente, formaPagamento, valorDado, livros);
        Assert.assertNotNull(venda.nomeCliente);
        Assert.assertNotNull(venda.formaPagamento);
        Assert.assertNotNull(venda.valorDado);
        Assert.assertNotNull(venda.livros);
        Assert.assertEquals(venda.nomeCliente, "Joao");
        Assert.assertEquals(venda.formaPagamento, "Debito");
        Assert.assertEquals(venda.valorDado, 30.4, 0.0001);
        Assert.assertEquals(venda.livros.size(), 1);
    }

    @Test
    public void testConstrutorSemParametros() {
        Venda venda = new Venda();
        Assert.assertNull(venda.nomeCliente);
        Assert.assertNull(venda.formaPagamento);
        Assert.assertEquals(0, venda.valorDado, 0.0001);
        Assert.assertNull(venda.livros);
    }
}
