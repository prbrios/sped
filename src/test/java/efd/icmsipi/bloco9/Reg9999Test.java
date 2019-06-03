package efd.icmsipi.bloco9;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg9999Test {

    @Test
    public void teste() {

        Reg9999 reg = new Reg9999();
        reg.setQtdLin(10);

        Assert.assertEquals(Util.formata("|9999|10|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|9999||"), Conversor.converteBloco(new Reg9999()));

    }

}
