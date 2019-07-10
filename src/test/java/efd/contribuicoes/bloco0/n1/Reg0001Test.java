package efd.contribuicoes.bloco0.n1;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0001Test {

    @Test
    public void teste(){
        Assert.assertEquals("0001", new Reg0001().getReg());
    }

    @Test
    public void teste2() {
        Reg0001 obj = new Reg0001(0);

        String parseado = Conversor.converte(obj);
        String esperado = "|0001|0|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
