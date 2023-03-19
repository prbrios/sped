package efd.icmsipi.blocoE.n1.n2.n3;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE111;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE115;
import efd.icmsipi.blocoE.n1.n2.n3.n4.RegE116;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegE110 implements Serializable {
	private static final long serialVersionUID = -3097902036071142093L;

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

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlTotDebitos() {
        return vlTotDebitos;
    }

    public void setVlTotDebitos(BigDecimal vlTotDebitos) {
        this.vlTotDebitos = vlTotDebitos;
    }

    public BigDecimal getVlAjDebitos() {
        return vlAjDebitos;
    }

    public void setVlAjDebitos(BigDecimal vlAjDebitos) {
        this.vlAjDebitos = vlAjDebitos;
    }

    public BigDecimal getVlTotAjDebitos() {
        return vlTotAjDebitos;
    }

    public void setVlTotAjDebitos(BigDecimal vlTotAjDebitos) {
        this.vlTotAjDebitos = vlTotAjDebitos;
    }

    public BigDecimal getVlEstornosCred() {
        return vlEstornosCred;
    }

    public void setVlEstornosCred(BigDecimal vlEstornosCred) {
        this.vlEstornosCred = vlEstornosCred;
    }

    public BigDecimal getVlTotCreditos() {
        return vlTotCreditos;
    }

    public void setVlTotCreditos(BigDecimal vlTotCreditos) {
        this.vlTotCreditos = vlTotCreditos;
    }

    public BigDecimal getVlAjCreditos() {
        return vlAjCreditos;
    }

    public void setVlAjCreditos(BigDecimal vlAjCreditos) {
        this.vlAjCreditos = vlAjCreditos;
    }

    public BigDecimal getVlTotAjCreditos() {
        return vlTotAjCreditos;
    }

    public void setVlTotAjCreditos(BigDecimal vlTotAjCreditos) {
        this.vlTotAjCreditos = vlTotAjCreditos;
    }

    public BigDecimal getVlEstornosDeb() {
        return vlEstornosDeb;
    }

    public void setVlEstornosDeb(BigDecimal vlEstornosDeb) {
        this.vlEstornosDeb = vlEstornosDeb;
    }

    public BigDecimal getVlSldCredoAnt() {
        return vlSldCredoAnt;
    }

    public void setVlSldCredoAnt(BigDecimal vlSldCredoAnt) {
        this.vlSldCredoAnt = vlSldCredoAnt;
    }

    public BigDecimal getVlSldApurado() {
        return vlSldApurado;
    }

    public void setVlSldApurado(BigDecimal vlSldApurado) {
        this.vlSldApurado = vlSldApurado;
    }

    public BigDecimal getVlTotDed() {
        return vlTotDed;
    }

    public void setVlTotDed(BigDecimal vlTotDed) {
        this.vlTotDed = vlTotDed;
    }

    public BigDecimal getVlicmsRecolher() {
        return vlicmsRecolher;
    }

    public void setVlicmsRecolher(BigDecimal vlicmsRecolher) {
        this.vlicmsRecolher = vlicmsRecolher;
    }

    public BigDecimal getVlSldCredorTransportar() {
        return vlSldCredorTransportar;
    }

    public void setVlSldCredorTransportar(BigDecimal vlSldCredorTransportar) {
        this.vlSldCredorTransportar = vlSldCredorTransportar;
    }

    public BigDecimal getDebEsp() {
        return debEsp;
    }

    public void setDebEsp(BigDecimal debEsp) {
        this.debEsp = debEsp;
    }

    public List<RegE111> getRegE111() {
        return regE111;
    }

    public void setRegE111(List<RegE111> regE111) {
        this.regE111 = regE111;
    }

    public List<RegE115> getRegE115() {
        return regE115;
    }

    public void setRegE115(List<RegE115> regE115) {
        this.regE115 = regE115;
    }

    public List<RegE116> getRegE116() {
        return regE116;
    }

    public void setRegE116(List<RegE116> regE116) {
        this.regE116 = regE116;
    }
    
}