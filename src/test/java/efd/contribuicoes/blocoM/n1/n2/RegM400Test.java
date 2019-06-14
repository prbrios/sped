package efd.contribuicoes.blocoM.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class RegM400Test {

    @Test
    public void teste(){
        Assert.assertEquals("M400", new RegM400().getReg());
    }

}
