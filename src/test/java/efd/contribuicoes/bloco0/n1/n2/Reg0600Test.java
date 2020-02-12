package efd.contribuicoes.bloco0.n1.n2;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0600Test {

    @Test
    public void teste(){
        Assert.assertEquals("0600", new Reg0600().getReg());
    }

    @Test
    public void teste2() {
        Reg0600 obj = new Reg0600(LocalDate.parse("2019-07-08"), "0", "0");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0600|08072019|0|0|");

        Assert.assertEquals(esperado, parseado);
    }
}
