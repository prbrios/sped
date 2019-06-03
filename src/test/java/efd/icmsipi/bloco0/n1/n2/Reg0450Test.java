package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0450Test {

    @Test
    public void teste() {

        Reg0450 reg = new Reg0450();
        reg.setCodInf("CODINF0");
        reg.setTxt("TEXTO LIVRE");

        Assert.assertEquals(Util.formata("|0450|CODINF0|TEXTO LIVRE|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0450|||"), Conversor.converteBloco(new Reg0450()));

    }

}
