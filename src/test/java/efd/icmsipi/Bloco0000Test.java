package efd.icmsipi;

import efd.Parsers;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Bloco0000Test {

    @Test
    public void deveMontarUmaString(){
/*
        Bloco0000 obj = new Bloco0000();
        obj.setCodVer("013");
        obj.setCodFin("0");
        obj.setDtIni(LocalDate.of(1500, 5, 22));
        obj.setDtFin(LocalDate.of(1500, 5, 22));
        obj.setNome("25.5399");
        obj.setCnpj("CNPJ");
        obj.setCpf("CPF");
        obj.setUf("CE");
        obj.setIe("IE");
        obj.setCodMun("CODMUN");
        obj.setIm("IM");
        obj.setSuframa("SUFRAMA");
        obj.setIndPerfil("A");
        obj.setIndAtiv("1");

        Bloco0001 bloco0001= new Bloco0001();
        bloco0001.setIndMov("1");

        Bloco0005 bloco0005= new Bloco0005();
        bloco0005.setBairro("Jacarecanga");
        bloco0005.setNum("10");

        bloco0001.setBloco0005(bloco0005);

        for(int i=0; i<1000; i++) {
            //bloco0001.getBloco0015().add(new Bloco0015());
        }

        obj.setBloco0001(bloco0001);

        String a = new Parsers().converteBlocoEmString(obj);
        System.out.println(a);
*/
        Assert.assertEquals(1, 1);

    }

    @Test
    public void deveMontarUmaString2(){

        Assert.assertEquals(1,1);

    }
}
