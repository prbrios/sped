package efd.contribuicoes.bloco0.n1.n2.n3.n4;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0208Test {

    @Test
    public void teste(){
        Assert.assertEquals("0208", new Reg0208().getReg());
    }

    @Test
    public void teste2() {
        Reg0208 obj = new Reg0208("01", "02", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0208|01|02|Teste|");

        Assert.assertEquals(esperado, parseado);
    }
}
