package efd.contribuicoes.bloco0.n1.n2.n3;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0145Test {

    @Test
    public void teste(){
        Assert.assertEquals("0145", new Reg0145().getReg());
    }

    @Test
    public void teste2() {
        Reg0145 obj = new Reg0145(1, new BigDecimal(1.11), new BigDecimal(1.11), new BigDecimal(1.11), "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0145|1|1,11|1,11|1,11|Teste|");

        Assert.assertEquals(esperado, parseado);
    }
}
