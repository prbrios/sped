package efd.icmsipi;

import efd.UF;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Bloco0001Test {

    @Test
    public void deveMontarUmaString2(){

        Bloco0001 obj = new Bloco0001();
        obj.setIndMov(Bloco0001.IndMov.BLOCO_COM_DADOS_INFORMADOS);

        Assert.assertEquals(obj.toString(), "|0001|0|");

    }

}
