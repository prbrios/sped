package efd.contribuicoes.bloco0;

import org.junit.Assert;
import org.junit.Test;

public class Reg0000Test {

    @Test
    public void teste(){
        Assert.assertEquals("0000", new Reg0000().getReg());
    }

}
