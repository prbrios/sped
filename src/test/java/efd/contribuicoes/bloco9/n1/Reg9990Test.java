package efd.contribuicoes.bloco9.n1;

import org.junit.Assert;
import org.junit.Test;

public class Reg9990Test {

    @Test
    public void teste(){
        Assert.assertEquals("9990", new Reg9990().getReg());
    }

}
