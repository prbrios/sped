package efd.contribuicoes.bloco9.n1;

import org.junit.Assert;
import org.junit.Test;

public class Reg9001Test {

    @Test
    public void teste(){
        Assert.assertEquals("9001", new Reg9001().getReg());
    }

}
