package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0400Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0400", new Reg0400().getReg());
    }

    @Test
    public void teste2() {

        Reg0400 reg = new Reg0400();
        reg.setCodNat("C.NAT");
        reg.setDescrNat("DESC NAT");

        Assert.assertEquals(Util.formata("|0400|C.NAT|DESC NAT|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0400 reg = new Reg0400();

        Assert.assertEquals(Util.formata("|0400|||"), Conversor.converteBloco(reg));
    }
}
