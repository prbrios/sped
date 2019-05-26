package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Inclui;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class BlocoE110 {

    @Inclui
    private final String reg = "E110";

    @Inclui
    private BigDecimal vlTotDebitos;

    @Inclui
    private BigDecimal vlAjDebitos;

    @Inclui
    private BigDecimal vlTotAjDebitos;

    @Inclui
    private BigDecimal vlEstornosCred;

    @Inclui
    private BigDecimal vlTotCreditos;

    @Inclui
    private BigDecimal vlAjCreditos;

    @Inclui
    private BigDecimal vlTotAjCreditos;

    @Inclui
    private BigDecimal vlEstornosDeb;

    @Inclui
    private BigDecimal vlSldCredoAnt;

    @Inclui
    private BigDecimal vlSldApurado;

    @Inclui
    private BigDecimal vlTotDed;

    @Inclui
    private BigDecimal vlicmsRecolher;

    @Inclui
    private BigDecimal vlSldCredorTransportar;

    @Inclui
    private BigDecimal debEsp;

}