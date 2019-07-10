package efd.contribuicoes.bloco1.n1;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg1001Test {

    @Test
    public void teste(){
        Assert.assertEquals("1001", new Reg1001().getReg());
    }

    @Test
    public void teste2() {
        Reg1001 obj = new Reg1001(0);

        String parseado = Conversor.converte(obj);
        String esperado = "|1001|0|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
