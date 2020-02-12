package efd.contribuicoes.bloco0.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0110Test {

    @Test
    public void teste(){
        Assert.assertEquals("0110", new Reg0110().getReg());
    }

    @Test
    public void teste2() {
        Reg0110 obj = new Reg0110(1, 1, 1, 1);

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0110|1|1|1|1|");

        Assert.assertEquals(esperado, parseado);
    }
}
