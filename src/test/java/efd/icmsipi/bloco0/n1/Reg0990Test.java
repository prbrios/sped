package efd.icmsipi.bloco0.n1;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0990Test {

    @Test
    public void teste() {

        Reg0990 reg = new Reg0990();
        reg.setQtdLin0(10);

        Assert.assertEquals(Util.formata("|0990|10|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0990||"), Conversor.converteBloco(new Reg0990()));

    }

}
