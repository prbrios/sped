package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE111;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE115;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE116;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class RegE110 {

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
    private List<RegE111> regE111;

    @Filho
    private List<RegE115> regE115;

    @Filho
    private List<RegE116> regE116;

    public RegE110(BigDecimal vlTotDebitos, BigDecimal vlAjDebitos, BigDecimal vlTotAjDebitos, BigDecimal vlEstornosCred, BigDecimal vlTotCreditos, BigDecimal vlAjCreditos, BigDecimal vlTotAjCreditos, BigDecimal vlEstornosDeb, BigDecimal vlSldCredoAnt, BigDecimal vlSldApurado, BigDecimal vlTotDed, BigDecimal vlicmsRecolher, BigDecimal vlSldCredorTransportar, BigDecimal debEsp) {
        this.vlTotDebitos = vlTotDebitos;
        this.vlAjDebitos = vlAjDebitos;
        this.vlTotAjDebitos = vlTotAjDebitos;
        this.vlEstornosCred = vlEstornosCred;
        this.vlTotCreditos = vlTotCreditos;
        this.vlAjCreditos = vlAjCreditos;
        this.vlTotAjCreditos = vlTotAjCreditos;
        this.vlEstornosDeb = vlEstornosDeb;
        this.vlSldCredoAnt = vlSldCredoAnt;
        this.vlSldApurado = vlSldApurado;
        this.vlTotDed = vlTotDed;
        this.vlicmsRecolher = vlicmsRecolher;
        this.vlSldCredorTransportar = vlSldCredorTransportar;
        this.debEsp = debEsp;
    }

    public RegE110(){}
}