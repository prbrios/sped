package efd.contribuicoes.blocoM.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class RegM200Test {

    @Test
    public void teste(){
        Assert.assertEquals("M200", new RegM200().getReg());
    }

}
