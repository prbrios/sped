package efd.contribuicoes.blocoM.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class RegM600Test {

    @Test
    public void teste(){
        Assert.assertEquals("M600", new RegM600().getReg());
    }

}
