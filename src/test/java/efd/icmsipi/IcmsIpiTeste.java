package efd.icmsipi;

import efd.Conversor;
import efd.IcmsIpi;
import org.junit.Test;

import java.time.LocalDate;

public class IcmsIpiTeste {

    @Test
    public void teste(){

        Bloco0000 bl0000 = new Bloco0000();
        bl0000.setCodVer(13);
        bl0000.setCodFin(1);
        bl0000.setDtIni(LocalDate.of(2019,4,1));
        bl0000.setDtFin(LocalDate.of(2019,4,30));
        bl0000.setNome("NOME");
        bl0000.setCnpj(12519063000289L);
        bl0000.setCpf(96385274113L);
        bl0000.setUf("CE");
        bl0000.setIe("123456789");
        bl0000.setCodMun(2304400);
        bl0000.setIm("999888777");
        bl0000.setSuframa("666333222");
        bl0000.setIndPerfil("A");
        bl0000.setIndAtiv(1);

        Bloco9999 bl9999 = new Bloco9999();
        bl9999.setQtdLin(99);

        IcmsIpi icmsIpi = new IcmsIpi();
        icmsIpi.setBloco0000(bl0000);
        icmsIpi.setBloco9999(bl9999);

        String s = Conversor.converte(icmsIpi);
        System.out.println(s);

    }

}
