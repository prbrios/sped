package efd.icmsipi.bloco9.n1;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg9001Test {

    @Test
    public void teste() {

        Reg9001 reg = new Reg9001();
        reg.setIndMov(1);

        Assert.assertEquals(Util.formata("|9001|1|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|9001||"), Conversor.converteBloco(new Reg9001()));
    }

}
