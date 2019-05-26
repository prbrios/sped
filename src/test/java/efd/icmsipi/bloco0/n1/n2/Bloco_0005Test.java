package efd.icmsipi.bloco0.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

public class Bloco_0005Test {

    @Test
    public void teste1() {
        Assert.assertEquals("0005", new Reg0005().getReg());
    }

    @Test
    public void teste2() {

        Reg0005 reg = new Reg0005();
        reg.setFantasia("FANTASIA");
        reg.setCep(61603100);
        reg.setEnd("RUA B");
        reg.setNum("304");
        reg.setCompl("APTO 2");
        reg.setBairro("CENTRO");
        reg.setFone("8534581823");
        reg.setFax("8534581823");
        reg.setEmail("email@email.com");

        Assert.assertEquals(Util.formata("|0005|FANTASIA|61603100|RUA B|304|APTO 2|CENTRO|8534581823|8534581823|email@email.com|"), Conversor.converteBloco(reg));
    }

    @Test
    public void teste3() {

        Reg0005 reg = new Reg0005();
        Assert.assertEquals(Util.formata("|0005||||||||||"), Conversor.converteBloco(reg));
    }

}
