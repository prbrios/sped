package efd.icmsipi;

import efd.Conversor;
import efd.IcmsIpi;
import efd.icmsipi.bloco0.Bloco0;
import org.junit.Test;

import java.time.LocalDate;

public class IcmsIpiTeste {

    @Test
    public void teste(){

        Reg0000 reg0000 = new Reg0000();
        reg0000.setCodVer(13);
        reg0000.setCodFin(1);
        reg0000.setDtIni(LocalDate.of(2019,4,1));
        reg0000.setDtFin(LocalDate.of(2019,4,30));
        reg0000.setNome("NOME");
        reg0000.setCnpj(12519063000289L);
        reg0000.setCpf(96385274113L);
        reg0000.setUf("CE");
        reg0000.setIe("123456789");
        reg0000.setCodMun(2304400);
        reg0000.setIm("999888777");
        reg0000.setSuframa("666333222");
        reg0000.setIndPerfil("A");
        reg0000.setIndAtiv(1);

        Reg9999 bl9999 = new Reg9999();
        bl9999.setQtdLin(99);

        IcmsIpi icmsIpi = new IcmsIpi();
        icmsIpi.setReg0000(reg0000);
        icmsIpi.setReg9999(bl9999);

        String s = Conversor.converte(icmsIpi);
        System.out.println(s);

    }

}
