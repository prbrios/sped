package efd.icmsipi.blocoB.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegB025 implements Serializable {
	private static final long serialVersionUID = -3641358584816024765L;

	@Inclui
    private final String reg = "B025";

    @Inclui
    private BigDecimal vlContP;

    @Inclui
    private BigDecimal vlBcIssP;

    @Inclui
    private BigDecimal aliqIss;

    @Inclui
    private BigDecimal vlIssP;

    @Inclui
    private BigDecimal vlIsntIssP;

    @Inclui
    private String codServ;

    public RegB025(BigDecimal vlContP, BigDecimal vlBcIssP, BigDecimal aliqIss, BigDecimal vlIssP, BigDecimal vlIsntIssP, String codServ) {
        this.vlContP = vlContP;
        this.vlBcIssP = vlBcIssP;
        this.aliqIss = aliqIss;
        this.vlIssP = vlIssP;
        this.vlIsntIssP = vlIsntIssP;
        this.codServ = codServ;
    }

    public RegB025(){}

    public String getReg() {
        return reg;
    }

    public BigDecimal getVlContP() {
        return vlContP;
    }

    public void setVlContP(BigDecimal vlContP) {
        this.vlContP = vlContP;
    }

    public BigDecimal getVlBcIssP() {
        return vlBcIssP;
    }

    public void setVlBcIssP(BigDecimal vlBcIssP) {
        this.vlBcIssP = vlBcIssP;
    }

    public BigDecimal getAliqIss() {
        return aliqIss;
    }

    public void setAliqIss(BigDecimal aliqIss) {
        this.aliqIss = aliqIss;
    }

    public BigDecimal getVlIssP() {
        return vlIssP;
    }

    public void setVlIssP(BigDecimal vlIssP) {
        this.vlIssP = vlIssP;
    }

    public BigDecimal getVlIsntIssP() {
        return vlIsntIssP;
    }

    public void setVlIsntIssP(BigDecimal vlIsntIssP) {
        this.vlIsntIssP = vlIsntIssP;
    }

    public String getCodServ() {
        return codServ;
    }

    public void setCodServ(String codServ) {
        this.codServ = codServ;
    }
    
}
