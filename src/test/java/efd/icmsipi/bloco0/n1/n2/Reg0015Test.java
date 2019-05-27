package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0015Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0015", new Reg0015().getReg());
    }

    @Test
    public void teste2() {

        Reg0015 reg = new Reg0015();
        reg.setUfSt("CE");
        reg.setIeSt("123456");

        Assert.assertEquals(Util.formata("|0015|CE|123456|"), Conversor.converteBloco(reg));

    }

    @Test
    public void teste3(){

        Reg0015 reg = new Reg0015();

        Assert.assertEquals(Util.formata("|0015|||"), Conversor.converteBloco(reg));

    }

}
