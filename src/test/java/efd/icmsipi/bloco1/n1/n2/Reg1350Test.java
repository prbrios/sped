package efd.icmsipi.bloco1.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg1350Test {

    @Test
    public void teste() {

        Reg1350 reg = new Reg1350("1", "FAB", "Mod5", "TM");

        Assert.assertEquals(Util.formata("|1350|1|FAB|Mod5|TM|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|1350|||||"), Conversor.converteBloco(new Reg1350()));
    }
}
