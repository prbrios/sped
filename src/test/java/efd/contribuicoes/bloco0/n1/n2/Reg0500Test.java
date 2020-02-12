package efd.contribuicoes.bloco0.n1.n2;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0500Test {

    @Test
    public void teste(){
        Assert.assertEquals("0500", new Reg0500().getReg());
    }

    @Test
    public void teste2() {
        Reg0500 obj = new Reg0500(LocalDate.parse("2019-07-08"), "01", "S", 12345, "12345", "Teste", "12345", 1L);

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0500|08072019|01|S|12345|12345|Teste|12345|00000000000001|");

        Assert.assertEquals(esperado, parseado);
    }
}
