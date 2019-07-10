package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0206Test {

    @Test
    public void teste(){
        Assert.assertEquals("0206", new Reg0206().getReg());
    }

    @Test
    public void teste2() {
        Reg0206 obj = new Reg0206("Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0206|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
