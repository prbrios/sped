package efd.contribuicoes.bloco0.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0140Test {

    @Test
    public void teste(){
        Assert.assertEquals("0140", new Reg0140().getReg());
    }

    @Test
    public void teste2() {
        Reg0140 obj = new Reg0140("1", "Teste", 1L, "CE", "1", 1, "PAULO", "123456789");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0140|1|Teste|00000000000001|CE|1|0000001|PAULO|123456789|");

        Assert.assertEquals(esperado, parseado);
    }
}
