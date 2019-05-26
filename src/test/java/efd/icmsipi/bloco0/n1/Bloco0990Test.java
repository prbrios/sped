package efd.icmsipi.bloco0.n1;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Bloco0990Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0001", new Bloco0001().getReg());
    }

    @Test
    public void teste2() {

        Bloco0001 reg = new Bloco0001();
        reg.setIndMov(new Integer(0));

        Assert.assertEquals(Util.formata("|0001|0|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Bloco0001 reg = new Bloco0001();
        Assert.assertEquals(Util.formata("|0001||"), Conversor.converteBloco(reg));
    }

}
