package efd.contribuicoes.blocoP.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegP001Test {

    @Test
    public void teste(){
        Assert.assertEquals("P001", new RegP001().getReg());
    }

}
