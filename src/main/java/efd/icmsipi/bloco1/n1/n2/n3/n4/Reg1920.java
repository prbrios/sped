package efd.icmsipi.bloco1.n1.n2.n3.n4;

import java.math.BigDecimal;
import java.util.List;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1921;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1925;
import efd.icmsipi.bloco1.n1.n2.n3.n4.n5.Reg1926;
import lombok.Getter;
import lombok.Setter;


public class Reg1920 {

    @Getter @Inclui
    private final String reg = "1920";

    @Getter @Setter @Inclui
    private BigDecimal vltotTransfDebitosOa;

    @Getter @Setter @Inclui
    private BigDecimal vlTotAjDebitosOa;

    @Getter @Setter @Inclui
    private BigDecimal vlEstornosCredOa;

    @Getter @Setter @Inclui
    private BigDecimal vlTotTransfCreditosOa;

    @Getter @Setter @Inclui
    private BigDecimal vlTotAjCretidosOa;

    @Getter @Setter @Inclui
    private BigDecimal vlEstornosDebOa;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredorAntOa;

    @Getter @Setter @Inclui
    private BigDecimal vlSldApuradoOa;

    @Getter @Setter @Inclui
    private BigDecimal vlTotDed;

    @Getter @Setter @Inclui
    private BigDecimal vlIcmsRecolherOa;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredorTranspOa;

    @Getter @Setter @Inclui
    private BigDecimal debEspOa;

    @Getter @Setter @Filho
    private List<Reg1921> reg1921;

    @Getter @Setter @Filho
    private List<Reg1925> reg1925;

    @Getter @Setter @Filho
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