package efd.contribuicoes.bloco0.n1.n2.n3;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0150Test {

    @Test
    public void teste(){
        Assert.assertEquals("0150", new Reg0150().getReg());
    }

    @Test
    public void teste2() {
        Reg0150 obj = new Reg0150("1", "2", 1, 1L, 1L, "1", 1, "123456789", "Teste", "1", "Teste", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0150|1|2|1|00000000000001|00000000001|1|0000001|123456789|Teste|1|Teste|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
