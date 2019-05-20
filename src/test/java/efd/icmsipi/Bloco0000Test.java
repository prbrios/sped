package efd.icmsipi;

import efd.UF;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

public class Bloco0000Test {

    @Test
    public void deveMontarUmaString(){

        Bloco0000 obj = new Bloco0000();
        obj.setCodVer("013");
        obj.setCodFin(Bloco0000.CodFin.REMESSA_DO_ARQUIVO_ORIGINAL);
        obj.setDtIni(LocalDate.of(2019, 5, 17));
        obj.setDtFin(LocalDate.of(2019, 5, 17));
        obj.setNome("NOME");
        obj.setCnpj("CNPJ");
        obj.setCpf("CPF");
        obj.setUf(UF.CEARA);
        obj.setIe("IE");
        obj.setCodMun("CODMUN");
        obj.setIm("IM");
        obj.setSuframa("SUFRAMA");
        obj.setIndPerfil(Bloco0000.IndPerfil.PERFIL_A);
        obj.setIndAtiv(Bloco0000.IndAtiv.OUTROS);

        Assert.assertEquals(obj.toString(), "|0000|013|0|17052019|17052019|NOME|CNPJ|CPF|CE|IE|CODMUN|IM|SUFRAMA|A|1|" + System.getProperty("line.separator"));

    }

    @Test
    public void deveMontarUmaString2(){

        Bloco0001 bloco0001 = new Bloco0001();
        bloco0001.setIndMov(Bloco0001.IndMov.BLOCO_COM_DADOS_INFORMADOS);

        Bloco0000 obj = new Bloco0000();
        obj.setCodVer("013");
        obj.setCodFin(Bloco0000.CodFin.REMESSA_DO_ARQUIVO_ORIGINAL);
        obj.setDtIni(LocalDate.of(2019, 5, 17));
        obj.setDtFin(LocalDate.of(2019, 5, 17));
        obj.setNome("NOME");
        obj.setCnpj("CNPJ");
        obj.setCpf("CPF");
        obj.setUf(UF.CEARA);
        obj.setIe("IE");
        obj.setCodMun("CODMUN");
        obj.setIm("IM");
        obj.setSuframa("SUFRAMA");
        obj.setIndPerfil(Bloco0000.IndPerfil.PERFIL_A);
        obj.setIndAtiv(Bloco0000.IndAtiv.OUTROS);

        obj.setBloco0001(bloco0001);

        Assert.assertEquals(obj.toString(), "|0000|013|0|17052019|17052019|NOME|CNPJ|CPF|CE|IE|CODMUN|IM|SUFRAMA|A|1|" + System.getProperty("line.separator") + "|0001|0|");

    }
}
