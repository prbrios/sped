package efd.icmsipi;

import efd.Conversor;
import org.junit.Assert;
import org.junit.Test;

public class Reg9999Test {

    @Test
    public void teste1() {
        Assert.assertEquals("9999", new Reg9999().getReg());
    }

    @Test
    public void teste2() {

        Reg9999 reg = new Reg9999();
        reg.setQtdLin(10);

        Assert.assertEquals(Util.formata("|9999|10|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg9999 reg = new Reg9999();

        Assert.assertEquals(Util.formata("|9999||"), Conversor.converteBloco(reg));
    }

}
