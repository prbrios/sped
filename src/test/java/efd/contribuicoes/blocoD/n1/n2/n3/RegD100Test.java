package efd.contribuicoes.blocoD.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

public class RegD100Test {

    @Test
    public void teste(){
        Assert.assertEquals("D100", new RegD100().getReg());
    }

}
