package efd.contribuicoes.bloco0.n1;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0990Test {

    @Test
    public void teste(){
        Assert.assertEquals("0990", new Reg0990().getReg());
    }

    @Test
    public void teste2() {
        Reg0990 obj = new Reg0990(1);

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0990|1|");

        Assert.assertEquals(esperado, parseado);
    }
}
