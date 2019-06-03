package efd.icmsipi.bloco0.n1.n2.n3;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Reg0305Test {

    @Test
    public void teste() {

        Reg0305 reg = new Reg0305();
        reg.setCodCcus("CC96325");
        reg.setFunc("Funcao");
        reg.setVidaUtil(23);

        Assert.assertEquals(Util.formata("|0305|CC96325|Funcao|23|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|0305||||"), Conversor.converteBloco(new Reg0305()));
    }

}
