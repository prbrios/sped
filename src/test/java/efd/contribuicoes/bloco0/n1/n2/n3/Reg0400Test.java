package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0400Test {

    @Test
    public void teste(){
        Assert.assertEquals("0400", new Reg0400().getReg());
    }

    @Test
    public void teste2() {
        Reg0400 obj = new Reg0400("1", "0");

        String parseado = Conversor.converte(obj);
        String esperado = "|0400|1|0|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
