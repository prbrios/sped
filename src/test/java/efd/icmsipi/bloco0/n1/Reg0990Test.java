package efd.icmsipi.bloco0.n1;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0990Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0990", new Reg0990().getReg());
    }

    @Test
    public void teste2() {

        Reg0990 reg = new Reg0990();
        reg.setQtdLin0(10);

        Assert.assertEquals(Util.formata("|0990|10|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0990 reg = new Reg0990();

        Assert.assertEquals(Util.formata("|0990||"), Conversor.converteBloco(reg));
    }

}
