package efd.icmsipi.bloco9.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg9900Test {

    @Test
    public void teste() {

        Reg9900 reg = new Reg9900();
        reg.setQtdRegBlc(1);
        reg.setRegBlc("0001");

        Assert.assertEquals(Util.formata("|9900|0001|1|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|9900|||"), Conversor.converteBloco(new Reg9900()));
    }

}
