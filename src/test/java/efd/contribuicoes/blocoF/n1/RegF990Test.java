package efd.contribuicoes.blocoF.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegF990Test {

    @Test
    public void teste(){
        Assert.assertEquals("F990", new RegF990().getReg());
    }

}
