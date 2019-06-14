package efd.contribuicoes.blocoM.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegM001Test {

    @Test
    public void teste(){
        Assert.assertEquals("M001", new RegM001().getReg());
    }

}
