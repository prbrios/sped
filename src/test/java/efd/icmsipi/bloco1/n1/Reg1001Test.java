package efd.icmsipi.bloco1.n1;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg1001Test {

    @Test
    public void teste() {

        Reg1001 reg = new Reg1001();
        reg.setIndMov(1);

        Assert.assertEquals(Util.formata("|1001|1|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|1001||"), Conversor.converteBloco(new Reg1001()));

    }

}
