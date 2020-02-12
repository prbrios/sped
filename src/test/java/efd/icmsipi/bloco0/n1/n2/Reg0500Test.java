package efd.icmsipi.bloco0.n1.n2;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0500Test {

    @Test
    public void teste() {

        Reg0500 reg = new Reg0500();
        reg.setDtAlt(LocalDate.of(2019,5,26));
        reg.setCodNatCc("01");
        reg.setIndCta("S");
        reg.setNivel(3);
        reg.setCodCta("CODCTA");
        reg.setNomeCta("Nome do CTA");

        Assert.assertEquals(Util.formata("|0500|26052019|01|S|3|CODCTA|Nome do CTA|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0500|||||||"), Conversor.converteBloco(new Reg0500()));

    }

}
