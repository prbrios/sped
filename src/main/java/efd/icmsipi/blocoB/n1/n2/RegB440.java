package efd.icmsipi.blocoB.n1.n2;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegB440 implements Serializable {
	private static final long serialVersionUID = -7560813795894164582L;

	@Inclui
    private final String reg = "B440";

    @Inclui
    private Integer indOper;

    @Inclui
    private String codPart;

    @Inclui
    private BigDecimal vlContRt;

    @Inclui
    private BigDecimal vlBcIssRt;

    @Inclui
    private BigDecimal vlIssRt;

    public RegB440(Integer indOper, String codPart, BigDecimal vlContRt, BigDecimal vlBcIssRt, BigDecimal vlIssRt) {
        this.indOper = indOper;
        this.codPart = codPart;
        this.vlContRt = vlContRt;
        this.vlBcIssRt = vlBcIssRt;
        this.vlIssRt = vlIssRt;
    }

    public RegB440(){}

    public String getReg() {
        return reg;
    }

    public Integer getIndOper() {
        return indOper;
    }

    public void setIndOper(Integer indOper) {
        this.indOper = indOper;
    }

    public String getCodPart() {
        return codPart;
    }

    public void setCodPart(String codPart) {
        this.codPart = codPart;
    }

    public BigDecimal getVlContRt() {
        return vlContRt;
    }

    public void setVlContRt(BigDecimal vlContRt) {
        this.vlContRt = vlContRt;
    }

    public BigDecimal getVlBcIssRt() {
        return vlBcIssRt;
    }

    public void setVlBcIssRt(BigDecimal vlBcIssRt) {
        this.vlBcIssRt = vlBcIssRt;
    }

    public BigDecimal getVlIssRt() {
        return vlIssRt;
    }

    public void setVlIssRt(BigDecimal vlIssRt) {
        this.vlIssRt = vlIssRt;
    }
    
}
