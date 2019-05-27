package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0450Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0450", new Reg0450().getReg());
    }

    @Test
    public void teste2() {

        Reg0450 reg = new Reg0450();
        reg.setCodInf("CODINF0");
        reg.setTxt("TEXTO LIVRE");

        Assert.assertEquals(Util.formata("|0450|CODINF0|TEXTO LIVRE|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0450 reg = new Reg0450();

        Assert.assertEquals(Util.formata("|0450|||"), Conversor.converteBloco(reg));
    }
}
