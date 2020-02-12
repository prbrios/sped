package efd.icmsipi.bloco0.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0460Test {

    @Test
    public void teste() {

        Reg0460 reg = new Reg0460();
        reg.setCodObs("CODObs");
        reg.setTxt("Texto Livre");

        Assert.assertEquals(Util.formata("|0460|CODObs|Texto Livre|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0460|||"), Conversor.converteBloco(new Reg0460()));

    }

}
