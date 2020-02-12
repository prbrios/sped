package efd.contribuicoes.bloco0.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0450Test {

    @Test
    public void teste(){
        Assert.assertEquals("0450", new Reg0450().getReg());
    }

    @Test
    public void teste2() {
        Reg0450 obj = new Reg0450("Teste", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0450|Teste|Teste|");

        Assert.assertEquals(esperado, parseado);
    }
}
