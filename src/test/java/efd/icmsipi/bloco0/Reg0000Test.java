package efd.icmsipi.bloco0;

import efd.Conversor;
import efd.Parsers;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Reg0000Test {

    @Test
    public void teste() {

        Reg0000 reg = new Reg0000();
        reg.setCodVer(13);
        reg.setCodFin(1);
        reg.setDtIni(LocalDate.of(2019,5,26));
        reg.setDtFin(LocalDate.of(2019,5,26));
        reg.setNome("SAINT SEYA");
        reg.setCnpj(1L);
        reg.setCpf(1L);
        reg.setUf("CE");
        reg.setIe("1");
        reg.setCodMun(1);
        reg.setIm("1");
        reg.setSuframa("123");
        reg.setIndPerfil("A");
        reg.setIndAtiv(1);

        Assert.assertEquals(Util.formata("|0000|013|1|26052019|26052019|SAINT SEYA|00000000000001|00000000001|CE|1|0000001|1|123|A|1|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0000|||||||||||||||"), Conversor.converteBloco(new Reg0000()));

    }

}
