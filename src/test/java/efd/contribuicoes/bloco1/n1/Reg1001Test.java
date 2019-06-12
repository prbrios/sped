package efd.contribuicoes.bloco1.n1;

import efd.contribuicoes.bloco0.Reg0000;
import org.junit.Assert;
import org.junit.Test;

public class Reg1001Test {

    @Test
    public void teste(){
        Assert.assertEquals("1001", new Reg1001().getReg());
    }

}
