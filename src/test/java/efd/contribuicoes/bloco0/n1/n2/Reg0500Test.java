package efd.contribuicoes.bloco0.n1.n2;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0500Test {

    @Test
    public void teste(){
        Assert.assertEquals("0500", new Reg0500().getReg());
    }

    @Test
    public void teste2() {
        Reg0500 obj = new Reg0500(LocalDate.parse("2019-07-08"), "01", "S", 12345, "12345", "Teste", "12345", 1L);

        String parseado = Conversor.converte(obj);
        String esperado = "|0500|08072019|01|S|12345|12345|Teste|12345|00000000000001|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
