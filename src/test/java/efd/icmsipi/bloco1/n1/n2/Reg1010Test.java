package efd.icmsipi.bloco1.n1.n2;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg1010Test {

    @Test
    public void teste() {

        Reg1010 reg = new Reg1010();
        reg.setIndExp("S");
        reg.setIndCcrf("N");
        reg.setIndComb("S");
        reg.setIndUsina("N");
        reg.setIndVa("S");
        reg.setIndEe("N");
        reg.setIndCart("S");
        reg.setIndForm("N");
        reg.setIndAer("S");
        reg.setIndGiaf1("N");
        reg.setIndGiaf3("S");
        reg.setIndGiaf4("N");
        reg.setIndRestResarcComplIcms("S");

        Assert.assertEquals(Util.formata("|1010|S|N|S|N|S|N|S|N|S|N|S|N|S|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|1010||||||||||||||"), Conversor.converteBloco(new Reg1010()));

    }

}
