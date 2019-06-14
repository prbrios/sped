package efd.contribuicoes.bloco1.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class Reg1900Test {

    @Test
    public void teste(){
        Assert.assertEquals("1900", new Reg1900().getReg());
    }

}
