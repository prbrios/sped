package efd.contribuicoes.bloco0.n1.n2.n3;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0200Test {

    @Test
    public void teste(){
        Assert.assertEquals("0200", new Reg0200().getReg());
    }

    @Test
    public void teste2() {
        Reg0200 obj = new Reg0200("12345", "Teste", "abc", "def", "UNI", 00, "123", "456", 00, 1111, new BigDecimal(1.11));

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0200|12345|Teste|abc|def|UNI|00|123|456|00|1111|1,11|");

        Assert.assertEquals(esperado, parseado);
    }
}
