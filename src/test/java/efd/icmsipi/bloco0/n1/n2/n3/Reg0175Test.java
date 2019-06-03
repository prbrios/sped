package efd.icmsipi.bloco0.n1.n2.n3;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0175Test {

    @Test
    public void teste() {

        Reg0175 reg = new Reg0175();
        reg.setDtAlt(LocalDate.of(2019, 5, 26));
        reg.setNrCampo("2");
        reg.setContAnt("X");

        Assert.assertEquals(Util.formata("|0175|26052019|2|X|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0175||||"), Conversor.converteBloco(new Reg0175()));
    }

}
