package efd.contribuicoes.bloco0.n1;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0990Test {

    @Test
    public void teste(){
        Assert.assertEquals("0990", new Reg0990().getReg());
    }

    @Test
    public void teste2() {
        Reg0990 obj = new Reg0990(1);

        String parseado = Conversor.converte(obj);
        String esperado = "|0990|1|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
