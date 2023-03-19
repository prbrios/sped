package efd.contribuicoes.blocoM.n1.n2.n3;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegM810 implements Serializable {
	private static final long serialVersionUID = 7925368718024739808L;

	@Inclui
	private final String reg = "M810";

    @Inclui
    private String natRec;

    @Inclui
    private BigDecimal vlRec;

    @Inclui
    private String codCta;

    @Inclui
    private String descCompl;

    public RegM810(String natRec, BigDecimal vlRec, String codCta, String descCompl) {
        this.natRec = natRec;
        this.vlRec = vlRec;
        this.codCta = codCta;
        this.descCompl = descCompl;
    }

    public RegM810(){}

    public String getReg() {
        return reg;
    }

    public String getNatRec() {
        return natRec;
    }

    public void setNatRec(String natRec) {
        this.natRec = natRec;
    }

    public BigDecimal getVlRec() {
        return vlRec;
    }

    public void setVlRec(BigDecimal vlRec) {
        this.vlRec = vlRec;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getDescCompl() {
        return descCompl;
    }

    public void setDescCompl(String descCompl) {
        this.descCompl = descCompl;
    }

    
}
