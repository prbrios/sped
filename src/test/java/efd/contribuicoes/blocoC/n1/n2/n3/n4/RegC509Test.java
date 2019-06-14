package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import org.junit.Assert;
import org.junit.Test;

public class RegC509Test {

    @Test
    public void teste(){
        Assert.assertEquals("C509", new RegC509().getReg());
    }

}
