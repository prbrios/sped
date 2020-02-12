package efd.contribuicoes.bloco0.n1.n2.n3;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0111Test {

    @Test
    public void teste(){
        Assert.assertEquals("0111", new Reg0111().getReg());
    }

    @Test
    public void teste2() {
        Reg0111 obj = new Reg0111(new BigDecimal(1.11), new BigDecimal(1.11), new BigDecimal(1.11), new BigDecimal(1.11), new BigDecimal(1.11));

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0111|1,11|1,11|1,11|1,11|1,11|");

        Assert.assertEquals(esperado, parseado);
    }
}
