package efd.contribuicoes.bloco0.n1.n2;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0120Test {

    @Test
    public void teste(){
        Assert.assertEquals("0120", new Reg0120().getReg());
    }

    @Test
    public void teste2() {
        Reg0120 obj = new Reg0120(LocalDate.parse("2019-07-08"), "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0120|072019|Teste|");

        Assert.assertEquals(esperado, parseado);
    }
}
