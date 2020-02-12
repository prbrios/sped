package efd.contribuicoes.bloco0.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0400Test {

    @Test
    public void teste(){
        Assert.assertEquals("0400", new Reg0400().getReg());
    }

    @Test
    public void teste2() {
        Reg0400 obj = new Reg0400("1", "0");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0400|1|0|");

        Assert.assertEquals(esperado, parseado);
    }
}
