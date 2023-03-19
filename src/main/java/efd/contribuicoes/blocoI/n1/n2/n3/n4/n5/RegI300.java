package efd.contribuicoes.blocoI.n1.n2.n3.n4.n5;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;

import efd.contribuicoes.blocoI.n1.n2.n3.n4.n5.n6.RegI399;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegI300 implements Serializable {
	private static final long serialVersionUID = 4044889657294379420L;

	@Inclui
	private final String reg = "I300";

    @Inclui
    private String codComp;

    @Inclui
    private BigDecimal detValor;

    @Inclui
    private String codCta;

    @Inclui
    private String infoCompl;

    @Filho
    private List<RegI399> regI399;

    public RegI300(String codComp, BigDecimal detValor, String codCta, String infoCompl) {
        this.codComp = codComp;
        this.detValor = detValor;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegI300(){}

    public String getReg() {
        return reg;
    }

    public String getCodComp() {
        return codComp;
    }

    public void setCodComp(String codComp) {
        this.codComp = codComp;
    }

    public BigDecimal getDetValor() {
        return detValor;
    }

    public void setDetValor(BigDecimal detValor) {
        this.detValor = detValor;
    }

    public String getCodCta() {
        return codCta;
    }

    public void setCodCta(String codCta) {
        this.codCta = codCta;
    }

    public String getInfoCompl() {
        return infoCompl;
    }

    public void setInfoCompl(String infoCompl) {
        this.infoCompl = infoCompl;
    }

    public List<RegI399> getRegI399() {
        return regI399;
    }

    public void setRegI399(List<RegI399> regI399) {
        this.regI399 = regI399;
    }
    
}
