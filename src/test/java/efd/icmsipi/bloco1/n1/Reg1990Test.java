package efd.icmsipi.bloco1.n1;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg1990Test {

    @Test
    public void teste() {

        Reg1990 reg = new Reg1990();
        reg.setQtdLin1(10);

        Assert.assertEquals(Util.formata("|1990|10|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|1990||"), Conversor.converteBloco(new Reg1990()));

    }

}
