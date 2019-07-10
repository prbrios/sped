package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg0145Test {

    @Test
    public void teste(){
        Assert.assertEquals("0145", new Reg0145().getReg());
    }

    @Test
    public void teste2() {
        Reg0145 obj = new Reg0145(1, new BigDecimal(1.11), new BigDecimal(1.11), new BigDecimal(1.11), "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0145|1|1,11|1,11|1,11|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
