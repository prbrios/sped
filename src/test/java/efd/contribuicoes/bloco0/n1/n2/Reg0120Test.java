package efd.contribuicoes.bloco0.n1.n2;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0120Test {

    @Test
    public void teste(){
        Assert.assertEquals("0120", new Reg0120().getReg());
    }

    @Test
    public void teste2() {
        Reg0120 obj = new Reg0120(LocalDate.parse("2019-07-08"), "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0120|072019|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
