package efd.icmsipi.blocoC.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC120 implements Serializable {
	private static final long serialVersionUID = 2585691622861994189L;

	@Inclui
    private final String reg = "C120";

    @Inclui
    private String codDocImp;

    @Inclui
    private String numDocImp;

    @Inclui
    private BigDecimal pisImp;

    @Inclui
    private BigDecimal cofinsImp;

    @Inclui
    private String numAcdraw;

    public RegC120(String codDocImp, String numDocImp, BigDecimal pisImp, BigDecimal cofinsImp, String numAcdraw) {
        this.codDocImp = codDocImp;
        this.numDocImp = numDocImp;
        this.pisImp = pisImp;
        this.cofinsImp = cofinsImp;
        this.numAcdraw = numAcdraw;
    }

    public RegC120(){}

    public String getReg() {
        return reg;
    }

    public String getCodDocImp() {
        return codDocImp;
    }

    public void setCodDocImp(String codDocImp) {
        this.codDocImp = codDocImp;
    }

    public String getNumDocImp() {
        return numDocImp;
    }

    public void setNumDocImp(String numDocImp) {
        this.numDocImp = numDocImp;
    }

    public BigDecimal getPisImp() {
        return pisImp;
    }

    public void setPisImp(BigDecimal pisImp) {
        this.pisImp = pisImp;
    }

    public BigDecimal getCofinsImp() {
        return cofinsImp;
    }

    public void setCofinsImp(BigDecimal cofinsImp) {
        this.cofinsImp = cofinsImp;
    }

    public String getNumAcdraw() {
        return numAcdraw;
    }

    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }
    
}
