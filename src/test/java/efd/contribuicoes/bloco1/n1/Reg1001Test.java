package efd.contribuicoes.bloco1.n1;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg1001Test {

    @Test
    public void teste(){
        Assert.assertEquals("1001", new Reg1001().getReg());
    }

    @Test
    public void teste2() {
        Reg1001 obj = new Reg1001("0");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|1001|0|");

        Assert.assertEquals(esperado, parseado);
    }
}
