package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0450Test {

    @Test
    public void teste(){
        Assert.assertEquals("0450", new Reg0450().getReg());
    }

    @Test
    public void teste2() {
        Reg0450 obj = new Reg0450("Teste", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0450|Teste|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
