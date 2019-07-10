package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0208Test {

    @Test
    public void teste(){
        Assert.assertEquals("0208", new Reg0208().getReg());
    }

    @Test
    public void teste2() {
        Reg0208 obj = new Reg0208("01", "02", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = "|0208|01|02|Teste|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
