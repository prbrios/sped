package efd.contribuicoes.blocoM.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

public class RegM205Test {

    @Test
    public void teste(){
        Assert.assertEquals("M205", new RegM205().getReg());
    }

}
