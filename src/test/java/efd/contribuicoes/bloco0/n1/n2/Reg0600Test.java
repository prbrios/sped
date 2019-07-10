package efd.contribuicoes.bloco0.n1.n2;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0600Test {

    @Test
    public void teste(){
        Assert.assertEquals("0600", new Reg0600().getReg());
    }

    @Test
    public void teste2() {
        Reg0600 obj = new Reg0600(LocalDate.parse("2019-07-08"), "0", "0");

        String parseado = Conversor.converte(obj);
        String esperado = "|0600|08072019|0|0|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
