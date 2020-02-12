package efd.contribuicoes.bloco0.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0150Test {

    @Test
    public void teste(){
        Assert.assertEquals("0150", new Reg0150().getReg());
    }

    @Test
    public void teste2() {
        Reg0150 obj = new Reg0150("1", "2", 1, 1L, 1L, "1", 1, "123456789", "Teste", "1", "Teste", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0150|1|2|1|00000000000001|00000000001|1|0000001|123456789|Teste|1|Teste|Teste|");

        Assert.assertEquals(esperado, parseado);
    }
}
