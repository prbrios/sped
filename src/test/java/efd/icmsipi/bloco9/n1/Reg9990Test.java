package efd.icmsipi.bloco9.n1;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg9990Test {

    @Test
    public void teste() {

        Reg9990 reg = new Reg9990();
        reg.setQtdLin9(1);

        Assert.assertEquals(Util.formata("|9990|1|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|9990||"), Conversor.converteBloco(new Reg9990()));
    }

}
