package efd.contribuicoes.blocoI.n1.n2.n3.n4;

import efd.anotacoes.Filho;
import efd.anotacoes.Inclui;

import efd.contribuicoes.blocoI.n1.n2.n3.n4.n5.RegI299;
import efd.contribuicoes.blocoI.n1.n2.n3.n4.n5.RegI300;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class RegI200 implements Serializable {
	private static final long serialVersionUID = -478467344746689352L;

	@Inclui
	private final String reg = "I200";

    @Inclui
    private String numCampo;

    @Inclui
    private String codDet;

    @Inclui
    private BigDecimal detValor;

    @Inclui
    private String codCta;

    @Inclui
    private String infoCompl;


    @Filho
    private List<RegI299> regI299;

    @Filho
    private List<RegI300> regI300;

    public RegI200(String numCampo, String codDet, BigDecimal detValor, String codCta, String infoCompl) {
        this.numCampo = numCampo;
        this.codDet = codDet;
        this.detValor = detValor;
        this.codCta = codCta;
        this.infoCompl = infoCompl;
    }

    public RegI200(){}

    public String getReg() {
        return reg;
    }

    public String getNumCampo() {
        return numCampo;
    }

    public void setNumCampo(String numCampo) {
        this.numCampo = numCampo;
    }

    public String getCodDet() {
        return codDet;
    }

    public void setCodDet(String codDet) {
        this.codDet = codDet;
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

    public List<RegI299> getRegI299() {
        return regI299;
    }

    public void setRegI299(List<RegI299> regI299) {
        this.regI299 = regI299;
    }

    public List<RegI300> getRegI300() {
        return regI300;
    }

    public void setRegI300(List<RegI300> regI300) {
        this.regI300 = regI300;
    }
    
}
