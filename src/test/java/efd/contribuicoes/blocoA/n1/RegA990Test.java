package efd.contribuicoes.blocoA.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegA990Test {

    @Test
    public void teste(){
        Assert.assertEquals("A990", new RegA990().getReg());
    }

}
