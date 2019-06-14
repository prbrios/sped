package efd.contribuicoes.blocoP.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class RegP200Test {

    @Test
    public void teste(){
        Assert.assertEquals("P200", new RegP200().getReg());
    }

}
