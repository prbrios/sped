package efd.contribuicoes.blocoM.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class RegM700Test {

    @Test
    public void teste(){
        Assert.assertEquals("M700", new RegM700().getReg());
    }

}
