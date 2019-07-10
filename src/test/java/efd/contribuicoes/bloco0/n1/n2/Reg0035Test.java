package efd.contribuicoes.bloco0.n1.n2;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0035Test {

    @Test
    public void teste(){
        Assert.assertEquals("0035", new Reg0035().getReg());
    }

    @Test
    public void teste2() {
        Reg0035 obj = new Reg0035(1, "Teste", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0035|00000000000001|Teste|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
