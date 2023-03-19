package efd.icmsipi.blocoK.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegK275 implements Serializable {
	private static final long serialVersionUID = 1687960802384362746L;

	@Inclui
    private final String reg = "K275";

    @Inclui
    private String codItem;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorPos;

    @Inclui(casasDecimais = 6)
    private BigDecimal qtdCorNeg;

    @Inclui
    private String codInsSubst;

    public RegK275(String codItem, BigDecimal qtdCorPos, BigDecimal qtdCorNeg, String codInsSubst) {
        this.codItem = codItem;
        this.qtdCorPos = qtdCorPos;
        this.qtdCorNeg = qtdCorNeg;
        this.codInsSubst = codInsSubst;
    }

    public RegK275(){}

    public String getReg() {
        return reg;
    }

    public String getCodItem() {
        return codItem;
    }

    public void setCodItem(String codItem) {
        this.codItem = codItem;
    }

    public BigDecimal getQtdCorPos() {
        return qtdCorPos;
    }

    public void setQtdCorPos(BigDecimal qtdCorPos) {
        this.qtdCorPos = qtdCorPos;
    }

    public BigDecimal getQtdCorNeg() {
        return qtdCorNeg;
    }

    public void setQtdCorNeg(BigDecimal qtdCorNeg) {
        this.qtdCorNeg = qtdCorNeg;
    }

    public String getCodInsSubst() {
        return codInsSubst;
    }

    public void setCodInsSubst(String codInsSubst) {
        this.codInsSubst = codInsSubst;
    }
    
}