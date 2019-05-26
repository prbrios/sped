package efd.icmsipi.bloco1.n1.n2.n3.n4;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Bloco1920 {

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

}