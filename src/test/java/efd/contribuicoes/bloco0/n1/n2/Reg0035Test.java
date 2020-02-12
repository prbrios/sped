package efd.contribuicoes.bloco0.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0035Test {

    @Test
    public void teste(){
        Assert.assertEquals("0035", new Reg0035().getReg());
    }

    @Test
    public void teste2() {
        Reg0035 obj = new Reg0035(1, "Teste", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0035|00000000000001|Teste|Teste|");

        Assert.assertEquals(esperado, parseado);
    }
}
