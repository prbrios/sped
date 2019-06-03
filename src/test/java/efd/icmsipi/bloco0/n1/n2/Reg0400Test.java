package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0400Test {

    @Test
    public void teste() {

        Reg0400 reg = new Reg0400();
        reg.setCodNat("C.NAT");
        reg.setDescrNat("DESC NAT");

        Assert.assertEquals(Util.formata("|0400|C.NAT|DESC NAT|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0400|||"), Conversor.converteBloco(new Reg0400()));

    }

}
