package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import efd.icmsipi.bloco0.n1.Reg0001;
import org.junit.Assert;
import org.junit.Test;

public class Reg0150Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0150", new Reg0150().getReg());
    }

    @Test
    public void teste2() {

        Reg0150 reg = new Reg0150();
        reg.setCodPart("JC100");
        reg.setNome("SAINT SEYA");
        reg.setCodPais(1058);
        reg.setCnpj(123L);
        reg.setCpf(123L);
        reg.setIe("123");
        reg.setCodMun(2304400);
        reg.setSuframa("");
        reg.setEnd("Rua X");
        reg.setNum("10");
        reg.setCompl("");
        reg.setBairro("Centro");

        Assert.assertEquals(Util.formata("|0150|JC100|SAINT SEYA|1058|00000000000123|00000000123|123|2304400||Rua X|10||Centro|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0150 reg = new Reg0150();

        Assert.assertEquals(Util.formata("|0150|||||||||||||"), Conversor.converteBloco(reg));
    }

}
