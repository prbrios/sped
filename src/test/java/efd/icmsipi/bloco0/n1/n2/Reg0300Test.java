package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0300Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0300", new Reg0300().getReg());
    }

    @Test
    public void teste2() {

        Reg0300 reg = new Reg0300();
        reg.setCodIndBem("C12Y");
        reg.setIdentMerc("5");
        reg.setDescrItem("FLOWER");
        reg.setCodPrnc("FF0");
        reg.setCodCta("C.CTA");
        reg.setNrParc(1);

        Assert.assertEquals(Util.formata("|0300|C12Y|5|FLOWER|FF0|C.CTA|1|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0300 reg = new Reg0300();

        Assert.assertEquals(Util.formata("|0300|||||||"), Conversor.converteBloco(reg));
    }
}
