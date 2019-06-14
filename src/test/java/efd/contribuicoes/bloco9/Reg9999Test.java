package efd.contribuicoes.bloco9;

import org.junit.Assert;
import org.junit.Test;

public class Reg9999Test {

    @Test
    public void teste(){
        Assert.assertEquals("9999", new Reg9999().getReg());
    }

}
