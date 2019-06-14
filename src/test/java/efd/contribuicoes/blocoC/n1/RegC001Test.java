package efd.contribuicoes.blocoC.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegC001Test {

    @Test
    public void teste(){
        Assert.assertEquals("C001", new RegC001().getReg());
    }

}
