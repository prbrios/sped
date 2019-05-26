package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.BlocoE111;
import efd.icmsipi.blocoE.n1.n2.n3.n4.BlocoE115;
import efd.icmsipi.blocoE.n1.n2.n3.n4.BlocoE116;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

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

    @Filho
    private List<BlocoE111> blocoE111;

    @Filho
    private List<BlocoE115> blocoE115;

    @Filho
    private List<BlocoE116> blocoE116;

}