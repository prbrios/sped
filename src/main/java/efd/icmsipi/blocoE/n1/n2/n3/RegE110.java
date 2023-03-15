package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE111;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE115;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE116;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


public class RegE110 implements Serializable {
	private static final long serialVersionUID = -3097902036071142093L;

	@Getter @Inclui
    private final String reg = "E110";

    @Getter @Setter @Inclui
    private BigDecimal vlTotDebitos;

    @Getter @Setter @Inclui
    private BigDecimal vlAjDebitos;

    @Getter @Setter @Inclui
    private BigDecimal vlTotAjDebitos;

    @Getter @Setter @Inclui
    private BigDecimal vlEstornosCred;

    @Getter @Setter @Inclui
    private BigDecimal vlTotCreditos;

    @Getter @Setter @Inclui
    private BigDecimal vlAjCreditos;

    @Getter @Setter @Inclui
    private BigDecimal vlTotAjCreditos;

    @Getter @Setter @Inclui
    private BigDecimal vlEstornosDeb;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredoAnt;

    @Getter @Setter @Inclui
    private BigDecimal vlSldApurado;

    @Getter @Setter @Inclui
    private BigDecimal vlTotDed;

    @Getter @Setter @Inclui
    private BigDecimal vlicmsRecolher;

    @Getter @Setter @Inclui
    private BigDecimal vlSldCredorTransportar;

    @Getter @Setter @Inclui
    private BigDecimal debEsp;

    @Getter @Setter @Filho
    private List<RegE111> regE111;

    @Getter @Setter @Filho
    private List<RegE115> regE115;

    @Getter @Setter @Filho
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