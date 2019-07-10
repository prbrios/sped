package efd.contribuicoes.bloco0.n1.n2;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0110Test {

    @Test
    public void teste(){
        Assert.assertEquals("0110", new Reg0110().getReg());
    }

    @Test
    public void teste2() {
        Reg0110 obj = new Reg0110(1, 1, 1, 1);

        String parseado = Conversor.converte(obj);
        String esperado = "|0110|1|1|1|1|" + System.getProperty("line.separator");

        Assert.assertEquals(esperado, parseado);
    }
}
