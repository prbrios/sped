package efd.icmsipi.bloco0.n1.n2.n3;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0206Test {

    @Test
    public void teste() {

        Reg0206 reg = new Reg0206();
        reg.setCodComb("CODIGO");

        Assert.assertEquals(Util.formata("|0206|CODIGO|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0206||"), Conversor.converteBloco(new Reg0206()));
    }

}
