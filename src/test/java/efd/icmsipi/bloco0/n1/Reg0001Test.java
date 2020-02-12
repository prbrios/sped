package efd.icmsipi.bloco0.n1;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0001Test {

    @Test
    public void teste() {

        Reg0001 reg = new Reg0001();
        reg.setIndMov(new Integer(0));

        Assert.assertEquals(Util.formata("|0001|0|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0001||"), Conversor.converteBloco(new Reg0001()));
    }


}
