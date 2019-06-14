package efd.contribuicoes.blocoP.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegP990Test {

    @Test
    public void teste(){
        Assert.assertEquals("P990", new RegP990().getReg());
    }

}
