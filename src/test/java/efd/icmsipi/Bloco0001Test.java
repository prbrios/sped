package efd.icmsipi;

import org.junit.Assert;
import org.junit.Test;

public class Bloco0001Test {

    @Test
    public void deveMontarUmaString2(){

        Bloco0001 obj = new Bloco0001();
        obj.setIndMov("0");

        Assert.assertEquals(obj.toString(), "|0001|0|");

    }

}
