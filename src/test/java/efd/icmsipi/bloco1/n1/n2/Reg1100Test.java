package efd.icmsipi.bloco1.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg1100Test {

    @Test
    public void teste() {

        Reg1100 reg = new Reg1100();
        reg.setIndDoc(1);
        reg.setNroDe("10");
        reg.setDtDe(LocalDate.of(2019,5,27));
        reg.setNatExp(1);
        reg.setNroRe(10);
        reg.setDtRe(LocalDate.of(2019,5,27));
        reg.setChcEmb("222");
        reg.setDtChc(LocalDate.of(2019,5,27));
        reg.setDtAvb(LocalDate.of(2019,5,27));
        reg.setTpChc(1);
        reg.setPais(1058);

        Assert.assertEquals(Util.formata("|1100|1|10|27052019|1|10|27052019|222|27052019|27052019|01|1058|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|1100||||||||||||"), Conversor.converteBloco(new Reg1100()));

    }

}
