package efd.icmsipi;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Bloco0000Test {

    @Test
    public void deveMontarUmaString(){

        Bloco0000 obj = new Bloco0000();
        obj.setCodVer("013");
        obj.setCodFin("0");
        obj.setDtIni(LocalDate.of(2019, 5, 17));
        obj.setDtFin(LocalDate.of(2019, 5, 17));
        obj.setNome("NOME");
        obj.setCnpj("CNPJ");
        obj.setCpf("CPF");
        obj.setUf("CE");
        obj.setIe("IE");
        obj.setCodMun("CODMUN");
        obj.setIm("IM");
        obj.setSuframa("SUFRAMA");
        obj.setIndPerfil("A");
        obj.setIndAtiv("1");

        Assert.assertEquals(obj.toString(), "|0000|013|0|17052019|17052019|NOME|CNPJ|CPF|CE|IE|CODMUN|IM|SUFRAMA|A|1|" + System.getProperty("line.separator"));

    }

    @Test
    public void deveMontarUmaString2(){

        Bloco0001 bloco0001 = new Bloco0001();
        bloco0001.setIndMov("0");

        Bloco0000 obj = new Bloco0000();
        obj.setCodVer("013");
        obj.setCodFin("0");
        obj.setDtIni(LocalDate.of(2019, 5, 17));
        obj.setDtFin(LocalDate.of(2019, 5, 17));
        obj.setNome("NOME");
        obj.setCnpj("CNPJ");
        obj.setCpf("CPF");
        obj.setUf("CE");
        obj.setIe("IE");
        obj.setCodMun("CODMUN");
        obj.setIm("IM");
        obj.setSuframa("SUFRAMA");
        obj.setIndPerfil("A");
        obj.setIndAtiv("1");

        obj.setBloco0001(bloco0001);

        Assert.assertEquals(obj.toString(), "|0000|013|0|17052019|17052019|NOME|CNPJ|CPF|CE|IE|CODMUN|IM|SUFRAMA|A|1|" + System.getProperty("line.separator") + "|0001|0|");

    }
}
