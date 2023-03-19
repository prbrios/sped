package efd.contribuicoes.blocoC.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegC199 implements Serializable {
	private static final long serialVersionUID = -7681184587320698794L;

	@Inclui
	private final String reg = "C199";

    @Inclui
    private String codDocImp;

    @Inclui
    private String numDocImp;

    @Inclui
    private BigDecimal vlPisImp;

    @Inclui
    private BigDecimal vlCofinsImp;

    @Inclui
    private String numAcdraw;

    public RegC199(String codDocImp, String numDocImp, BigDecimal vlPisImp, BigDecimal vlCofinsImp, String numAcdraw) {
        this.codDocImp = codDocImp;
        this.numDocImp = numDocImp;
        this.vlPisImp = vlPisImp;
        this.vlCofinsImp = vlCofinsImp;
        this.numAcdraw = numAcdraw;
    }

    public RegC199(){}

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

    public BigDecimal getVlPisImp() {
        return vlPisImp;
    }

    public void setVlPisImp(BigDecimal vlPisImp) {
        this.vlPisImp = vlPisImp;
    }

    public BigDecimal getVlCofinsImp() {
        return vlCofinsImp;
    }

    public void setVlCofinsImp(BigDecimal vlCofinsImp) {
        this.vlCofinsImp = vlCofinsImp;
    }

    public String getNumAcdraw() {
        return numAcdraw;
    }

    public void setNumAcdraw(String numAcdraw) {
        this.numAcdraw = numAcdraw;
    }
    
}
