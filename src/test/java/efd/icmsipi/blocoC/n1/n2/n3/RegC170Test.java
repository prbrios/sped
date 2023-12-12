package efd.icmsipi.blocoC.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class RegC170Test {
    
    @Test
    public void teste() {

        RegC170 reg = new RegC170();
        reg.setCstIpi(3);

        Assert.assertEquals(Util.formata("|C170|||||||||||||||||||03|||||||||||||||||||"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|C170||||||||||||||||||||||||||||||||||||||"), Conversor.converteBloco(new RegC170()));
    }
}
