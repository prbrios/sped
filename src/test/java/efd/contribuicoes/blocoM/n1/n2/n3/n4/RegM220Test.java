package efd.contribuicoes.blocoM.n1.n2.n3.n4;

import efd.contribuicoes.blocoM.n1.n2.RegM200;
import org.junit.Assert;
import org.junit.Test;

public class RegM220Test {

    @Test
    public void teste(){
        Assert.assertEquals("M220", new RegM220().getReg());
    }

}
