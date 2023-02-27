package efd.ecd;

import org.junit.Test;

import efd.Conversor;
import efd.Ecd;
import efd.ecd.bloco0.Reg0000;
import efd.ecd.bloco0.n1.Reg0001;
import efd.ecd.blocoC.n1.RegC001;
import efd.ecd.blocoI.n1.RegI001;
import efd.ecd.blocoJ.n1.RegJ001;
import efd.ecd.blocoK.n1.RegK001;

public class EcdTest {
    
    @Test
    public void arquivoCompleto() {

        //TODO implementar o teste

        Reg0000 reg0000 = new Reg0000();
        reg0000.setReg0001(this.getReg0001());
        reg0000.setRegC001(this.getRegC001());
        reg0000.setRegI001(this.getRegI001());
        reg0000.setRegJ001(this.getRegJ001());
        reg0000.setRegK001(this.getRegK001());

        Ecd ecd = new Ecd();
        ecd.setReg0000(reg0000);
        String sped = Conversor.converte(ecd, true);

        System.out.println(sped);
    }

    private Reg0001 getReg0001() {
        Reg0001 reg0001 = new Reg0001();
        return reg0001;
    }

    private RegC001 getRegC001() {
        return null;
    }

    private RegI001 getRegI001() {
        return null;
    }

    private RegJ001 getRegJ001() {
        return null;
    }

    private RegK001 getRegK001() {
        return null;
    }
}
