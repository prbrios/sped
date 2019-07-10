package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0190Test {

    @Test
    public void teste(){
        Assert.assertEquals("0190", new Reg0190().getReg());
    }

    @Test
    public void teste2() {
        Reg0190 obj = new Reg0190("UNI", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0190|UNI|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
