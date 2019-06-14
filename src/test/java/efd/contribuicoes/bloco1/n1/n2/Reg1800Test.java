package efd.contribuicoes.bloco1.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class Reg1800Test {

    @Test
    public void teste(){
        Assert.assertEquals("1800", new Reg1800().getReg());
    }

}
