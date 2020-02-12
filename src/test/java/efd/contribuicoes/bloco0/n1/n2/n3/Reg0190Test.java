package efd.contribuicoes.bloco0.n1.n2.n3;

import org.junit.Assert;
import org.junit.Test;

import efd.Conversor;
import efd.icmsipi.Util;

public class Reg0190Test {

    @Test
    public void teste(){
        Assert.assertEquals("0190", new Reg0190().getReg());
    }

    @Test
    public void teste2() {
        Reg0190 obj = new Reg0190("UNI", "Teste");

        String parseado = Conversor.converte(obj);
        String esperado = Util.formata("|0190|UNI|Teste|");

        Assert.assertEquals(esperado, parseado);
    }
}
