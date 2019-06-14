package efd.contribuicoes.blocoD.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

public class RegD600Test {

    @Test
    public void teste(){
        Assert.assertEquals("D600", new RegD600().getReg());
    }

}
