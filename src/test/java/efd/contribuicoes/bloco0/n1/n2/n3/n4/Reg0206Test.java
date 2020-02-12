package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0206Test {

    @Test
    public void teste(){
        Assert.assertEquals("0206", new Reg0206().getReg());
    }

    @Test
    public void teste2() {
        Reg0206 obj = new Reg0206("Teste");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0206|Teste|");

        Assert.assertEquals(esperado, parseado);
    }
}
