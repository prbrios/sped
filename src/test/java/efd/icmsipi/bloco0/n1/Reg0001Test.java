package efd.icmsipi.bloco0.n1;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0001Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0001", new Reg0001().getReg());
    }

    @Test
    public void teste2() {

        Reg0001 reg = new Reg0001();
        reg.setIndMov(new Integer(0));

        Assert.assertEquals(Util.formata("|0001|0|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0001 reg = new Reg0001();

        Assert.assertEquals(Util.formata("|0001||"), Conversor.converteBloco(reg));
    }



}
