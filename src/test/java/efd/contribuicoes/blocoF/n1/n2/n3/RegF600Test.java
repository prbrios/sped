package efd.contribuicoes.blocoF.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

public class RegF600Test {

    @Test
    public void teste(){
        Assert.assertEquals("F600", new RegF600().getReg());
    }

}
