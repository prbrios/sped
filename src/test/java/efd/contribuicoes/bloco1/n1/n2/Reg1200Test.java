package efd.contribuicoes.bloco1.n1.n2;

import org.junit.Assert;
import org.junit.Test;

public class Reg1200Test {

    @Test
    public void teste(){
        Assert.assertEquals("1200", new Reg1200().getReg());
    }

}
