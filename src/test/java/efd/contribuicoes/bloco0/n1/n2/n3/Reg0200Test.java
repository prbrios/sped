package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg0200Test {

    @Test
    public void teste(){
        Assert.assertEquals("0200", new Reg0200().getReg());
    }

    @Test
    public void teste2() {
        Reg0200 obj = new Reg0200("12345", "Teste", "abc", "def", "UNI", 00, "123", "456", 00, 1111, new BigDecimal(1.11));

        String parseado = Conversor.converte(obj);
        String esperado = "|0200|12345|Teste|abc|def|UNI|00|123|456|00|1111|1,11|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
