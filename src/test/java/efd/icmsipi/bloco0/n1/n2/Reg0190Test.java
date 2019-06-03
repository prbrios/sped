package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0190Test {

    @Test
    public void teste() {

        Reg0190 reg = new Reg0190();
        reg.setUnid("UND");
        reg.setDescr("Unidade");

        Assert.assertEquals(Util.formata("|0190|UND|Unidade|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0190|||"), Conversor.converteBloco(new Reg0190()));
    }

}
