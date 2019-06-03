package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0600Test {

    @Test
    public void teste() {

        Reg0600 reg = new Reg0600();
        reg.setDtAlt(LocalDate.of(2019,5,26));
        reg.setCodCcus("CC001");
        reg.setCcus("Centro de Custo CC001");

        Assert.assertEquals(Util.formata("|0600|26052019|CC001|Centro de Custo CC001|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0600||||"), Conversor.converteBloco(new Reg0600()));

    }

}
