package efd.contribuicoes.blocoA.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegA001Test {

    @Test
    public void teste(){
        Assert.assertEquals("A001", new RegA001().getReg());
    }

}
