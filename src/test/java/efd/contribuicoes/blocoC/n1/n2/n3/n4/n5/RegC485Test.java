package efd.contribuicoes.blocoC.n1.n2.n3.n4.n5;

import org.junit.Assert;
import org.junit.Test;

public class RegC485Test {

    @Test
    public void teste(){
        Assert.assertEquals("C485", new RegC485().getReg());
    }

}
