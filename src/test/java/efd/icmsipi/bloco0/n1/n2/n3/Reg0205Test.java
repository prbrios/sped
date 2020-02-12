package efd.icmsipi.bloco0.n1.n2.n3;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0205Test {

    @Test
    public void teste() {

        Reg0205 reg = new Reg0205();
        reg.setDescrAntItem("Desc anterior do item");
        reg.setDtIni(LocalDate.of(2019,5,26));
        reg.setDtFim(LocalDate.of(2019,5,26));
        reg.setCodAntItem("LAPIS");

        Assert.assertEquals(Util.formata("|0205|Desc anterior do item|26052019|26052019|LAPIS|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0205|||||"), Conversor.converteBloco(new Reg0205()));
    }

}
