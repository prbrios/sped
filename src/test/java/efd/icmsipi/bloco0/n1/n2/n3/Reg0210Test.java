package efd.icmsipi.bloco0.n1.n2.n3;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class Reg0210Test {

    @Test
    public void teste() {

        Reg0210 reg = new Reg0210();
        reg.setCodItemComp("COD");
        reg.setQtdComp(new BigDecimal(6));
        reg.setPerda(new BigDecimal(8));

        Assert.assertEquals(Util.formata("|0210|COD|6,000000|8,0000|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0210||||"), Conversor.converteBloco(new Reg0210()));
    }

}
