package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg0111Test {

    @Test
    public void teste(){
        Assert.assertEquals("0111", new Reg0111().getReg());
    }

    @Test
    public void teste2() {
        Reg0111 obj = new Reg0111(new BigDecimal(1.11), new BigDecimal(1.11), new BigDecimal(1.11), new BigDecimal(1.11), new BigDecimal(1.11));

        String parseado = Conversor.converte(obj);
        String esperado = "|0111|1,11|1,11|1,11|1,11|1,11|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
