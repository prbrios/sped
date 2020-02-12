package efd.icmsipi.bloco1.n1.n2;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg1400Test {

    @Test
    public void teste() {

        Reg1400 reg = new Reg1400();
        reg.setCodItemImp("CODi");
        reg.setMun(4400);
        reg.setValor(new BigDecimal(1));

        Assert.assertEquals(Util.formata("|1400|CODi|0004400|1,00|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|1400||||"), Conversor.converteBloco(new Reg1400()));
    }

}
