package efd.contribuicoes.blocoP.n1.n2.n3.n4;

import efd.anotacoes.Inclui;

import java.io.Serializable;
import java.math.BigDecimal;

public class RegP110 implements Serializable {
	private static final long serialVersionUID = 1576155504418536275L;

	@Inclui
	private final String reg = "P110";

    @Inclui
    private String numCampo;

    @Inclui
    private String codDet;

    @Inclui
    private BigDecimal detValor;

    @Inclui
    private String infCompl;

    public RegP110(String numCampo, String codDet, BigDecimal detValor, String infCompl) {
        this.numCampo = numCampo;
        this.codDet = codDet;
        this.detValor = detValor;
        this.infCompl = infCompl;
    }

    public RegP110(){}

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

    public String getInfCompl() {
        return infCompl;
    }

    public void setInfCompl(String infCompl) {
        this.infCompl = infCompl;
    }
    
}
