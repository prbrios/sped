package efd.contribuicoes.blocoM.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class RegM300Test {

    @Test
    public void teste(){
        Assert.assertEquals("M300", new RegM300().getReg());
    }

}
