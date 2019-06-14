package efd.contribuicoes.bloco1.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class Reg1500Test {

    @Test
    public void teste(){
        Assert.assertEquals("1500", new Reg1500().getReg());
    }

}
