package efd.icmsipi.bloco1.n1.n2;

import efd.Conversor;
import efd.icmsipi.Util;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Reg1300Test {

    @Test
    public void teste() {

        Reg1300 reg = new Reg1300();
        reg.setCodItem("CODi");
        reg.setDtFech(LocalDate.of(2019,5,27));
        reg.setEstqAbert(new BigDecimal(1));
        reg.setVolEntr(new BigDecimal(2));
        reg.setVolDisp(new BigDecimal(3));
        reg.setVolSaidas(new BigDecimal(4));
        reg.setEstqEscr(new BigDecimal(5));
        reg.setValAjPerda(new BigDecimal(6));
        reg.setValAjGanho(new BigDecimal(7));
        reg.setFechFisico(new BigDecimal(8));

        Assert.assertEquals(Util.formata("|1300|CODi|27052019|1,000|2,000|3,000|4,000|5,000|6,000|7,000|8,000|"), Conversor.converteBloco(reg));
        Assert.assertEquals(Util.formata("|1300|||||||||||"), Conversor.converteBloco(new Reg1300()));
    }

}
