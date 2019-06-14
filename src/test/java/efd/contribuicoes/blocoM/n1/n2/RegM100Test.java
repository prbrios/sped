package efd.contribuicoes.blocoM.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class RegM100Test {

    @Test
    public void teste(){
        Assert.assertEquals("M100", new RegM100().getReg());
    }

}
