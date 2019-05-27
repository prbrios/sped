package efd.icmsipi.bloco0.n1.n2.n3;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class Reg0220Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0220", new Reg0220().getReg());
    }

    @Test
    public void teste2() {

        Reg0220 reg = new Reg0220();
        reg.setUnidConv("UND");
        reg.setFatConv(new BigDecimal(153));

        Assert.assertEquals(Util.formata("|0220|UND|153,000000|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0220 reg = new Reg0220();

        Assert.assertEquals(Util.formata("|0220|||"), Conversor.converteBloco(reg));
    }
}
