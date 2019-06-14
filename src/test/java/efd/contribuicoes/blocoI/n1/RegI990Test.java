package efd.contribuicoes.blocoI.n1;

import org.junit.Assert;
import org.junit.Test;

public class RegI990Test {

    @Test
    public void teste(){
        Assert.assertEquals("I990", new RegI990().getReg());
    }

}
