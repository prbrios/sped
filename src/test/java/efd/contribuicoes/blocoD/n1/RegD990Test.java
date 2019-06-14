package efd.contribuicoes.blocoD.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegD990Test {

    @Test
    public void teste(){
        Assert.assertEquals("D990", new RegD990().getReg());
    }

}
