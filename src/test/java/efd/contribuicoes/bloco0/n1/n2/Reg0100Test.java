package efd.contribuicoes.bloco0.n1.n2;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0100Test {

    @Test
    public void teste(){
        Assert.assertEquals("0100", new Reg0100().getReg());
    }

    @Test
    public void teste2() {
    Reg0100 obj = new Reg0100("Teste", 1L, "1", 1L, 1, "Teste", "1", "1", "Teste", "1", "1", "1", 9);

        String parseado = Conversor.converte(obj);
        String esperado = "|0100|Teste|00000000001|1|00000000000001|00000001|Teste|1|1|Teste|1|1|1|0000009|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
