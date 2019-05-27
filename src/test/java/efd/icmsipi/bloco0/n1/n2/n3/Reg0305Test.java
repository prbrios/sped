package efd.icmsipi.bloco0.n1.n2.n3;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0305Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0305", new Reg0305().getReg());
    }

    @Test
    public void teste2() {

        Reg0305 reg = new Reg0305();
        reg.setCodCcus("CC96325");
        reg.setFunc("Funcao");
        reg.setVidaUtil(23);

        Assert.assertEquals(Util.formata("|0305|CC96325|Funcao|23|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0305 reg = new Reg0305();

        Assert.assertEquals(Util.formata("|0305||||"), Conversor.converteBloco(reg));
    }

}
