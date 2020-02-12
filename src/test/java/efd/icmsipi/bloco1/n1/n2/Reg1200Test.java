package efd.icmsipi.bloco1.n1.n2;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg1200Test {

    @Test
    public void teste() {

        Reg1200 reg = new Reg1200();
        reg.setCodAjApur("C150");
        reg.setSldCred(new BigDecimal(1));
        reg.setCredApr(new BigDecimal(2));
        reg.setCredReceb(new BigDecimal(3));
        reg.setCredUtil(new BigDecimal(4));
        reg.setSldCredFim(new BigDecimal(5));

        Assert.assertEquals(Util.formata("|1200|C150|1,00|2,00|3,00|4,00|5,00|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|1200|||||||"), Conversor.converteBloco(new Reg1200()));
    }

}
