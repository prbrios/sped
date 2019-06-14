package efd.contribuicoes.bloco1.n1;

import org.junit.Assert;
import org.junit.Test;

public class Reg1990Test {

    @Test
    public void teste(){
        Assert.assertEquals("1990", new Reg1990().getReg());
    }

}
