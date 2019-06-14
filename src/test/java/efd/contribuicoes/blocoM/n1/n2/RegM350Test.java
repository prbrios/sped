package efd.contribuicoes.blocoM.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class RegM350Test {

    @Test
    public void teste(){
        Assert.assertEquals("M350", new RegM350().getReg());
    }

}
