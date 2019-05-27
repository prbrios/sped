package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0190Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0190", new Reg0190().getReg());
    }

    @Test
    public void teste2() {

        Reg0190 reg = new Reg0190();
        reg.setUnid("UND");
        reg.setDescr("Unidade");

        Assert.assertEquals(Util.formata("|0190|UND|Unidade|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0190 reg = new Reg0190();

        Assert.assertEquals(Util.formata("|0190|||"), Conversor.converteBloco(reg));
    }
}
