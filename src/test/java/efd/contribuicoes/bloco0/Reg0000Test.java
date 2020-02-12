package efd.contribuicoes.bloco0;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0000Test {

    @Test
    public void teste(){
        Assert.assertEquals("0000", new Reg0000().getReg());
    }

    @Test
    public void teste2() {
        Reg0000 obj = new Reg0000(1, 0, 0, null, LocalDate.parse("2019-06-14"), LocalDate.parse("2019-06-14"), "PAULO", 12519065000127L, "CE", 2, "ABC98764", 1, 9);

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0000|001|0|0||14062019|14062019|PAULO|12519065000127|CE|0000002|ABC98764|01|9|");

        Assert.assertEquals(esperado, parseado);
    }
}
