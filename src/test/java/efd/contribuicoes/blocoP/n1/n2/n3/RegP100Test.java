package efd.contribuicoes.blocoP.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

public class RegP100Test {

    @Test
    public void teste(){
        Assert.assertEquals("P100", new RegP100().getReg());
    }

}
