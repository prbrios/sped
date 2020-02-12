package efd.contribuicoes.bloco0.n1;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0001Test {

    @Test
    public void teste(){
        Assert.assertEquals("0001", new Reg0001().getReg());
    }

    @Test
    public void teste2() {
        Reg0001 obj = new Reg0001(0);

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0001|0|");

        Assert.assertEquals(esperado, parseado);
    }
}
