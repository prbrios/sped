package efd.icmsipi.blocoD.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegD101 implements Serializable {
	private static final long serialVersionUID = -7457192667181992731L;

	@Inclui
    private final String reg = "D101";

    @Inclui
    private BigDecimal vlFcpUfDest;

    @Inclui
    private BigDecimal vlIcmsUfDest;

    @Inclui
    private BigDecimal vlIcmsUfRem;

    public RegD101(BigDecimal vlFcpUfDest, BigDecimal vlIcmsUfDest, BigDecimal vlIcmsUfRem) {
        this.vlFcpUfDest = vlFcpUfDest;
        this.vlIcmsUfDest = vlIcmsUfDest;
        this.vlIcmsUfRem = vlIcmsUfRem;
    }

    public RegD101(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlFcpUfDest() {
        return vlFcpUfDest;
    }

    public void setVlFcpUfDest(BigDecimal vlFcpUfDest) {
        this.vlFcpUfDest = vlFcpUfDest;
    }

    public BigDecimal getVlIcmsUfDest() {
        return vlIcmsUfDest;
    }

    public void setVlIcmsUfDest(BigDecimal vlIcmsUfDest) {
        this.vlIcmsUfDest = vlIcmsUfDest;
    }

    public BigDecimal getVlIcmsUfRem() {
        return vlIcmsUfRem;
    }

    public void setVlIcmsUfRem(BigDecimal vlIcmsUfRem) {
        this.vlIcmsUfRem = vlIcmsUfRem;
    }
    
}