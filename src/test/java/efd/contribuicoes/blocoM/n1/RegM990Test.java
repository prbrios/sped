package efd.contribuicoes.blocoM.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegM990Test {

    @Test
    public void teste(){
        Assert.assertEquals("M990", new RegM990().getReg());
    }

}
