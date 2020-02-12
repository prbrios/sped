package efd.contribuicoes.bloco0.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0100Test {

    @Test
    public void teste(){
        Assert.assertEquals("0100", new Reg0100().getReg());
    }

    @Test
    public void teste2() {
    Reg0100 obj = new Reg0100("Teste", 1L, "1", 1L, 1, "Teste", "1", "1", "Teste", "1", "1", "1", 9);

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0100|Teste|00000000001|1|00000000000001|00000001|Teste|1|1|Teste|1|1|1|0000009|");

        Assert.assertEquals(esperado, parseado);
    }
}
