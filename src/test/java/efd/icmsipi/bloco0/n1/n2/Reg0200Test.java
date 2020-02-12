package efd.icmsipi.bloco0.n1.n2;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0200Test {

    @Test
    public void teste() {

        Reg0200 reg = new Reg0200();
        reg.setCodItem("C1");
        reg.setDescrItem("ITEM");
        reg.setCodBarras("12345678");
        reg.setCodAntItem("C0");
        reg.setUnidInv("UND");
        reg.setTipoItem(1);
        reg.setCodNcm(10002358);
        reg.setExIpi("");
        reg.setCodGen(0);
        reg.setCodLst("LST");
        reg.setAliqIcms(new BigDecimal(18.00));
        reg.setCest(1402330);

        Assert.assertEquals(Util.formata("|0200|C1|ITEM|12345678|C0|UND|01|10002358||00|LST|18,00|1402330|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0200|||||||||||||"), Conversor.converteBloco(new Reg0200()));

    }

}
