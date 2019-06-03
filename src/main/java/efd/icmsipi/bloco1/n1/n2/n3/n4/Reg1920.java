package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1921;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1925;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1926;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Reg1920 {

    @Inclui
    private final String reg = "1920";

    @Inclui
    private BigDecimal vltotTransfDebitosOa;

    @Inclui
    private BigDecimal vlTotAjDebitosOa;

    @Inclui
    private BigDecimal vlEstornosCredOa;

    @Inclui
    private BigDecimal vlTotTransfCreditosOa;

    @Inclui
    private BigDecimal vlTotAjCretidosOa;

    @Inclui
    private BigDecimal vlEstornosDebOa;

    @Inclui
    private BigDecimal vlSldCredorAntOa;

    @Inclui
    private BigDecimal vlSldApuradoOa;

    @Inclui
    private BigDecimal vlTotDed;

    @Inclui
    private BigDecimal vlIcmsRecolherOa;

    @Inclui
    private BigDecimal vlSldCredorTranspOa;

    @Inclui
    private BigDecimal debEspOa;

    @Filho
    private List<Reg1921> reg1921;

    @Filho
    private List<Reg1925> reg1925;

    @Filho
    private List<Reg1926> reg1926;

    public Reg1920(BigDecimal vltotTransfDebitosOa, BigDecimal vlTotAjDebitosOa, BigDecimal vlEstornosCredOa, BigDecimal vlTotTransfCreditosOa, BigDecimal vlTotAjCretidosOa, BigDecimal vlEstornosDebOa, BigDecimal vlSldCredorAntOa, BigDecimal vlSldApuradoOa, BigDecimal vlTotDed, BigDecimal vlIcmsRecolherOa, BigDecimal vlSldCredorTranspOa, BigDecimal debEspOa) {
        this.vltotTransfDebitosOa = vltotTransfDebitosOa;
        this.vlTotAjDebitosOa = vlTotAjDebitosOa;
        this.vlEstornosCredOa = vlEstornosCredOa;
        this.vlTotTransfCreditosOa = vlTotTransfCreditosOa;
        this.vlTotAjCretidosOa = vlTotAjCretidosOa;
        this.vlEstornosDebOa = vlEstornosDebOa;
        this.vlSldCredorAntOa = vlSldCredorAntOa;
        this.vlSldApuradoOa = vlSldApuradoOa;
        this.vlTotDed = vlTotDed;
        this.vlIcmsRecolherOa = vlIcmsRecolherOa;
        this.vlSldCredorTranspOa = vlSldCredorTranspOa;
        this.debEspOa = debEspOa;
    }

    public Reg1920(){}
}